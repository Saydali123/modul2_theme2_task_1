package com.example.modul2_theme2_task1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "users")
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"firstName", "lastName"})})
public class User {
    //generate not repeated code for product
    private static Integer generateCode = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;


    @Column(nullable = false, unique = true)
    @Size(min = 9, max = 13)
    private String phoneNumber; // +998911234567 or 911234567

    @Column(unique = true)
    private Integer code = generateCode++;

    @Column(nullable = false, unique = true)
    @Size(min = 8, max = 16)
    private String password;

    private boolean active = true;
}
