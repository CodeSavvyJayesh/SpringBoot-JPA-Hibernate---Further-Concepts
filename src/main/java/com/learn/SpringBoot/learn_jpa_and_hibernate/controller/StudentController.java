package com.learn.SpringBoot.learn_jpa_and_hibernate.controller;

import com.learn.SpringBoot.learn_jpa_and_hibernate.dto.StudentRequestDTO;
import com.learn.SpringBoot.learn_jpa_and_hibernate.dto.StudentResponseDTO;
import com.learn.SpringBoot.learn_jpa_and_hibernate.entity.Student;
import com.learn.SpringBoot.learn_jpa_and_hibernate.repository.StudentRepository;
import com.learn.SpringBoot.learn_jpa_and_hibernate.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    // we have to make the constuctor inject

    public StudentController(StudentService studentService)
    {
         this.studentService = studentService;
    }
    // post mapping (create account)
    @PostMapping
    public StudentResponseDTO createStudent(@RequestBody StudentRequestDTO requestDTO)
    {
         return studentService.createStudent(requestDTO);
    }
    @GetMapping
    public List<StudentResponseDTO> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/{id}")
    public StudentResponseDTO getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
    // put -> update student
    @PutMapping
    public StudentResponseDTO updateStudent(@PathVariable Long id, @RequestBody StudentRequestDTO requestDTO)
    {
        return studentService.updateStudent(id,requestDTO);

    }
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }


}
