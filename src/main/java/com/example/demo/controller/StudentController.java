package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.entity.Email;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.EmailRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("students")
    public List<Student> getStudents() {
        Email email = new Email("sardortohirov222@gmail.com", "sardor22");
        Student student = new Student("Sardor", "Tokhirov", email);
        studentRepository.save(student);
        return studentRepository.findAll();
    }
    @GetMapping("courses")
    public List<Course> getCourses() {
        List<Teacher> teacher=teacherRepository.findAll();
        Course course=new Course("Java","In this can Learn how to write a code in java you need some speciefic abilities they are: Now about how work programming and about freamworks",20,teacher.get(0));
        courseRepository.save(course);
        return courseRepository.findAll();
    }

    @GetMapping("teacher")
    public List<Teacher> getTeachers() {
        Email email = new Email("abdurashidilik@gmail.com", "dilshod11");
        Teacher teacher = new Teacher("Abdurashid", "Dilshodov", email);
        teacherRepository.save(teacher);
        return teacherRepository.findAll();

    }
}
