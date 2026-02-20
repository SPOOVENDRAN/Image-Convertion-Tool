package com.imageConvertiontool.ic.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String empid;

    private String name;
    private String email;
    private String phone;
    private String department;
    private String designation;
    private String manager;
    private String location;
    private LocalDate joiningDate;

    private String status;
    private Integer experience;
    @Column(name = "curr_projects")
    private Integer currProjects;
    private String employment_type = "FULL_TIME";
    @Column(name = "total_projects")
    private Integer totalProjects;

    private int productivityRate;
    private int goalAchievement;
    @Column(nullable = false)
    private Boolean deleted = false;
}
