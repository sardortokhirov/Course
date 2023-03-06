package com.example.demo.repository;

import com.example.demo.entity.Email;
import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Date-3/5/2023
 * Time-7:56 AM
 */
public interface  EmailRepository  extends JpaRepository<Email, Long> {
}
