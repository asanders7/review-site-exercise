package org.review.site.reviewsiteexercise;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String suffix;

    @OneToOne
    private Address address;

    @OneToMany(mappedBy = "employeeId")
    private Collection<Employee_Project> employeeProjects;
    protected Employee(){}

    public Employee(String firstName, String middleName, String lastName, String suffix, Address address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.address = address;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSuffix() {
        return suffix;
    }

    public Address getAddress() {
        return address;
    }

    public Collection<Employee_Project> getEmployeeProjects() {
        return employeeProjects;
    }
}


