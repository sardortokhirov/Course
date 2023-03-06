package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

/**
 * Date-3/4/2023
 * Time-9:18 AM
 */
@Entity
@Table(name = "course")
public class Course {
    @Id
    @SequenceGenerator(
            name = "course_sequence",
            sequenceName = "course_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_sequence"
    )
    @Column(name = "course_id")
    private Long id;

    @Column(name = "course_name")
    private String name;

    @Column(name = "course_descr")
    private String description;

    private Integer price;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;


    public Course(String name, String description, Integer price, Teacher teacher) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.teacher = teacher;
    }


    public Course() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}
