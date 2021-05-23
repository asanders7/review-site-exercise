package org.review.site.reviewsiteexercise;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Project {

    @Id
    @GeneratedValue
    private Long id;
    private String projectName;
    protected Project(){}

    @OneToMany(mappedBy = "projectId")
    private Collection<Employee_Project> employeeProjects;

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public Long getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }

    public Collection<Employee_Project> getEmployeeProjects() {
        return employeeProjects;
    }
}
