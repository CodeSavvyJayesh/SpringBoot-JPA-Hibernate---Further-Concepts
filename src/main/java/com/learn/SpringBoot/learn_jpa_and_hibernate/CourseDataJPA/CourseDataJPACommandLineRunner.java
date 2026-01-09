package com.learn.SpringBoot.learn_jpa_and_hibernate.CourseDataJPA;

import com.learn.SpringBoot.learn_jpa_and_hibernate.CourseJPA.Course;
import com.learn.SpringBoot.learn_jpa_and_hibernate.CourseJPA.CourseJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class CourseDataJPACommandLineRunner implements CommandLineRunner {
   @Autowired
    private CourseDataJPARepository repository;





    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Java", "Jayesh"));


        repository.save(new Course(2,"C++", "Samaira"));

        repository.save(new Course(3, "Python", "Shweta"));



        repository.findAll();



    }
}
