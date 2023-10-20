package com.example.FirstSpringBoot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student seyha = new Student(
                    "Seyha VORN",
                    "seyhavorn@gmail.com",
                    LocalDate.of(2001, Month.AUGUST, 16)
            );

            Student alex = new Student(
                    "Chan Alex",
                    "chanalex@gmail.com",
                    LocalDate.of(2000, Month.AUGUST, 20)
            );

            studentRepository.saveAll(
                    List.of(seyha, alex)
            );
        };
    }
}
