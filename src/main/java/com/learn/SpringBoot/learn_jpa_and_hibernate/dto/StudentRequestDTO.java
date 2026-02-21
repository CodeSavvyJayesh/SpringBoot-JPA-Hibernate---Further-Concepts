package com.learn.SpringBoot.learn_jpa_and_hibernate.dto;

public class StudentRequestDTO
{
    private String name;
    private String course;

    public String getName(){
        return name;
    }
    public String getCourse(){
        return course;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCourse(String course){
         this.course = course;
    }
}
