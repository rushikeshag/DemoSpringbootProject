package com.kryptominds.DemoApplication.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Entity
public class EmployerDocuments {
    @Id
    private long employerId;
    private String documentName;
    private double documentSize;
    @JsonBackReference
    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "employerProfile",referencedColumnName = "id")
    private EmployerProfile employerProfile;

    public EmployerDocuments() {

    }

    public EmployerDocuments(long employerId, String documentName, double documentSize) {
        this.employerId = employerId;
        this.documentName = documentName;
        this.documentSize = documentSize;
    }

    public long getEmployerId() {
        return employerId;
    }

    public void setEmployerId(long employerId) {
        this.employerId = employerId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public double getDocumentSize() {
        return documentSize;
    }

    public void setDocumentSize(double documentSize) {
        this.documentSize = documentSize;
    }

    @Override
    public String toString() {
        return "EmployerDocuments{" +
                "employerId=" + employerId +
                ", documentName='" + documentName + '\'' +
                ", documentSize='" + documentSize + '\'' +
                '}';
    }
}
