package com.learn.SpringBoot.learn_jpa_and_hibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String course;

    //
    public Long getId(){
        return id;
    }
    public String getName(){
         return name;
    }
    public String getCourse(){
         return course;
    }

    public void setName(String name){
         this.name = name;
    }
    public void setId(Long id){
         this.id = id;

    }
    public void setCourse(String course){
        this.course = course;
    }
}
