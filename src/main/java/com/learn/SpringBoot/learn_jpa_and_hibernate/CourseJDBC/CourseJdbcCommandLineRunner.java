package com.learn.SpringBoot.learn_jpa_and_hibernate.CourseJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
   @Autowired
    private CourseJdbcRepository repository;





    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Java", "Jayesh"));
        repository.insert(new Course(2,"C++", "Samaira"));

        repository.deleteById(2);




    }
}
