package com.ghani.learnthymeleaf.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_employees")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String department;

}
