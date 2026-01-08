package com.learn.SpringBoot.learn_jpa_and_hibernate.CourseJPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJPARepository {
    @PersistenceContext
    private EntityManager entityManager;

    // to insert
    public void insert(Course course)
    {
        entityManager.merge(course);
    }

    // to findby Id

}
