package com.learn.SpringBoot.learn_jpa_and_hibernate.service;

import com.learn.SpringBoot.learn_jpa_and_hibernate.dto.StudentRequestDTO;
import com.learn.SpringBoot.learn_jpa_and_hibernate.dto.StudentResponseDTO;
import com.learn.SpringBoot.learn_jpa_and_hibernate.entity.Student;
import com.learn.SpringBoot.learn_jpa_and_hibernate.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    // Constructor Injection
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // CREATE
    public StudentResponseDTO createStudent(StudentRequestDTO requestDTO) {

        // Step 1 - Convert RequestDTO to Entity
        Student student = new Student();
        student.setName(requestDTO.getName());
        student.setCourse(requestDTO.getCourse());

        // Step 2 - Save to database
        Student saved = studentRepository.save(student);

        // Step 3 - Convert to ResponseDTO and return
        StudentResponseDTO response = new StudentResponseDTO();
        response.setId(saved.getId());
        response.setName(saved.getName());
        response.setCourse(saved.getCourse());

        return response;
    }

    // GET ALL
    public List<StudentResponseDTO> getAllStudents() {

        // Step 1 - Get all from database
        List<Student> students = studentRepository.findAll();

        // Step 2 - Convert each to ResponseDTO
        List<StudentResponseDTO> responseList = new ArrayList<>();

        for (Student student : students) {
            StudentResponseDTO response = new StudentResponseDTO();
            response.setId(student.getId());
            response.setName(student.getName());
            response.setCourse(student.getCourse());
            responseList.add(response);
        }

        return responseList;
    }

    // GET BY ID
    public StudentResponseDTO getStudentById(Long id) {

        // Step 1 - Find student
        Student student = studentRepository.findById(id).get();

        // Step 2 - Convert to ResponseDTO and return
        StudentResponseDTO response = new StudentResponseDTO();
        response.setId(student.getId());
        response.setName(student.getName());
        response.setCourse(student.getCourse());

        return response;
    }

    // UPDATE
    public StudentResponseDTO updateStudent(Long id, StudentRequestDTO requestDTO) {

        // Step 1 - Find existing student
        Student student = studentRepository.findById(id).get();

        // Step 2 - Update fields
        student.setName(requestDTO.getName());
        student.setCourse(requestDTO.getCourse());

        // Step 3 - Save updated student
        Student updated = studentRepository.save(student);

        // Step 4 - Convert to ResponseDTO and return
        StudentResponseDTO response = new StudentResponseDTO();
        response.setId(updated.getId());
        response.setName(updated.getName());
        response.setCourse(updated.getCourse());

        return response;
    }

    // DELETE
    public String deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return "Student deleted successfully!";
    }
}