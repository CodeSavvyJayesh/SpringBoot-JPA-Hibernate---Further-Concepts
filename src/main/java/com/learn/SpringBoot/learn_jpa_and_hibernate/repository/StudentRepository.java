package com.learn.SpringBoot.learn_jpa_and_hibernate.repository;

import com.learn.SpringBoot.learn_jpa_and_hibernate.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
