package com.example.demo.repository;

import com.example.demo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Date-3/5/2023
 * Time-7:45 AM
 */

public interface CourseRepository extends JpaRepository<Course, Long> {
}
