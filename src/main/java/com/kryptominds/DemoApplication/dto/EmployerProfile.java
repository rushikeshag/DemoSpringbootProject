package com.kryptominds.DemoApplication.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class EmployerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String employerName;
    private long salary;
    @JsonManagedReference
    @OneToMany(mappedBy = "employerProfile", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<EmployerDocuments> employerDocumentsList;


    public EmployerProfile() {

    }

    public EmployerProfile(long id, String employerName, long salary, List<EmployerDocuments> employerDocumentsList) {
        this.id = id;
        this.employerName = employerName;
        this.salary = salary;
        this.employerDocumentsList = employerDocumentsList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public List<EmployerDocuments> getEmployerDocumentsList() {
        return employerDocumentsList;
    }

    public void setEmployerDocumentsList(List<EmployerDocuments> employerDocumentsList) {
        this.employerDocumentsList = employerDocumentsList;
    }

    @Override
    public String toString() {
        return "EmployerProfile{" +
                "id=" + id +
                ", employerName='" + employerName + '\'' +
                ", salary=" + salary +
                ", employerDocumentsList=" + employerDocumentsList +
                '}';
    }
}
