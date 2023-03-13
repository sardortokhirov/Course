package com.example.demo.entity;

import jakarta.persistence.*;

/**
 * Date-3/4/2023
 * Time-9:02 AM
 */
@Entity
@Table(name = "email")
public class Email {
    @Id
    @SequenceGenerator(name = "email_sequence", sequenceName = "email_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "email_sequence")
    @Column(name = "email_id")
    private Long id;


    private String email;



    private String password;

    @OneToOne(mappedBy = "emails")
    private Student student;

    @OneToOne(mappedBy = "email")
    private Teacher teacher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Email() {
    }

    public Email(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
