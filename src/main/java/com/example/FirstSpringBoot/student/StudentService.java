package com.example.FirstSpringBoot.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//Using @Service for allow to inject to other class:
@Service
public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student(
                        12L,
                        "Seyha VORN",
                        "seyhavorn@gmail.com",
                        LocalDate.of(2023, Month.AUGUST, 16),
                        22
                )
        );
    }
}
