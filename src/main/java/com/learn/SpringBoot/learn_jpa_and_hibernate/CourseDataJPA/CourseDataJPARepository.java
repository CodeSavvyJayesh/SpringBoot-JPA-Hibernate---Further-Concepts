package com.learn.SpringBoot.learn_jpa_and_hibernate.CourseDataJPA;

import com.learn.SpringBoot.learn_jpa_and_hibernate.CourseJPA.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDataJPARepository extends JpaRepository<Course,Integer> {


}
