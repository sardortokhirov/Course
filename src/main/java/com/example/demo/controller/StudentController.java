package com.example.demo.controller;

import com.example.demo.entity.Email;
import com.example.demo.entity.Student;
import com.example.demo.repository.EmailRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Date-3/5/2023
 * Time-7:58 AM
 */
@RestController
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private EmailRepository emailRepository;


    @GetMapping("students")
    public List<Student> getStudents() {
        Email email = new Email("sardortohirov222@gmail.com","sardor22");
        Student student = new Student("Sardor", "Tokhirov",email);
        studentRepository.save(student);
        System.out.println("");
        return studentRepository.findAll();
    }
}
