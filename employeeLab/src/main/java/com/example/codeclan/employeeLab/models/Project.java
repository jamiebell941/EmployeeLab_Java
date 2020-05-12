package com.example.codeclan.employeeLab.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column(name = "num_of_days")
    private int numOfDays;
    @ManyToMany
    @JoinTable(
            name = "employee_projects",
            joinColumns = { @JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false )
            },
            inverseJoinColumns = {@JoinColumn(name = "employee_id", nullable = false,
            updatable = false )
            }
    )
    private List<Employee> employees;

    public Project(String name, int numOfDays) {
        this.name = name;
        this.numOfDays = numOfDays;
        this.employees = new ArrayList<Employee>();
    }

    public Project(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfDays() {
        return numOfDays;
    }

    public void setNumOfDays(int numOfDays) {
        this.numOfDays = numOfDays;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
}
