package com.example.demo.student;

import java.time.LocalDate;

public class Student {

    // Class variables
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    // Constructors
    public Student() {

    }

    public Student(
            Long id,
            String name,
            String email,
            LocalDate dob,
            Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(
            String name,
            String email,
            LocalDate dob,
            Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    // Getters and setters
    public Long getId() {
        return this.id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public String getname() {
        return this.name;
    }

    public void setID(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // To string
    @Override
    public String toString() {
        return "Student {" +
                "id=" + id + '\'' +
                "name=" + name + '\'' +
                "email=" + email + '\'' +
                "dob=" + dob + '\'' +
                "age=" + age +
                '}';
    }
}
