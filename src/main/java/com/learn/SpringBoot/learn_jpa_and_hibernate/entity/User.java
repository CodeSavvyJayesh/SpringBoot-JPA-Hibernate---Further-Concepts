package com.learn.SpringBoot.learn_jpa_and_hibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     @Column(unique = true, nullable = false)
     private String email;
     @Column(nullable = false)
     private String password;
}
