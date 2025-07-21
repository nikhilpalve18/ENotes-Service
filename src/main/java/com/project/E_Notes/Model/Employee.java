package com.project.E_Notes.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private Long empId;
    private String empName;
}
