package com.eazybytes.jobportal.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
//we will use the same name we have used for table in the DB
@Getter
@Setter
@Table(name="companies")
public class Company {

//    we will define all the fields of the table

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Column(name = "NAME",nullable = false,unique = true)
    private String name;

    @Column(name = "LOGO", length = 500)
    private String logo;

    @Column(name = "INDUSTRY", nullable = false, length = 100)
    private String industry;

    @Column(name = "SIZE", nullable = false, length = 50)
    private String size;

    @Column(name = "RATING", nullable = false, precision = 3, scale = 2)
    private BigDecimal rating;

    @Column(name = "LOCATIONS", length = 1000)
    private String locations;

    @Column(name = "FOUNDED", nullable = false)
    private Integer founded;

    @Lob
    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "EMPLOYEES")
    private Integer employees;

    @Column(name = "WEBSITE", length = 500)
    private String website;

    @Column(name = "CREATED_AT", nullable = false)
    private Instant createdAt;

    @Column(name = "CREATED_BY", nullable = false, length = 20)
    private String createdBy;

    @Column(name = "UPDATED_AT")
    private Instant updatedAt;

    @Column(name = "UPDATED_BY", length = 20)
    private String updatedBy;

    //we have removed getter and setter from the code and are using the Lombok  to generate them
}
