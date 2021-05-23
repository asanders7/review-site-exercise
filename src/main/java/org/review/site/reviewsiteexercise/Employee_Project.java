package org.review.site.reviewsiteexercise;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee_Project {

    @ManyToOne
    private Employee employeeId;

    @ManyToOne
    private Project projectId;

    @Id
    @GeneratedValue
    private Long id;

    protected Employee_Project(){}

    public Employee_Project(Employee employeeId, Project projectId) {
        this.employeeId = employeeId;
        this.projectId = projectId;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public Project getProjectId() {
        return projectId;
    }

    public Long getId() {
        return id;
    }
}
