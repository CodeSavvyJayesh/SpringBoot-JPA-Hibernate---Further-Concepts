package com.learn.SpringBoot.learn_jpa_and_hibernate.CourseJPA;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
       @Id
       private int id;
       @Column(name = "name")
       private String name;
       @Column(name = "author")
       private String author;

       public Course()
       {

       }
       public Course(int id,String name,String author)
       {
           super();
           this.id = id;
           this.name = name;
           this.author = author;
       }

       public int getId()
       { return id;}

       public String getName(){
           return name;
       }

       public String getAuthor(){
           return author;
       }

       public String toStrig(){
            return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
       }
}
