package com.learn.SpringBoot.learn_jpa_and_hibernate.CourseJPA;

import com.learn.SpringBoot.learn_jpa_and_hibernate.CourseJDBC.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJPACommandLineRunner implements CommandLineRunner {
   @Autowired
    private CourseJPARepository repository;





    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Java", "Jayesh"));


        repository.insert(new Course(2,"C++", "Samaira"));

        repository.insert(new Course(3, "Python", "Shweta"));







    }
}
