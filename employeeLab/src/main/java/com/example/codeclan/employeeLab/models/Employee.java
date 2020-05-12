package com.example.codeclan.employeeLab.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;


//    private List<Projects> projects;

    public Employee(String firstName, String lastName, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;

//        this.projects = new ArrayList<Projects>();
    }

    public Employee(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getEmployeeId() {
        return id;
    }

    public void setEmployeeId(Long id) {
        this.id = id;
    }

//    public List<Projects> getProjects() {
//        return projects;
//    }
//
//    public void setProjects(List<Projects> projects) {
//        this.projects = projects;
//    }
}
