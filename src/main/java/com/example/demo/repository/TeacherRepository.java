package com.example.demo.repository;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Date-3/5/2023
 * Time-9:07 AM
 */

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
