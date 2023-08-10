package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student Oscar = new Student("Oscar", "oscar@gmail.com", LocalDate.of(2000, 12, 1));
            Student Antonio = new Student("Antonio", "antonio@gmail.com", LocalDate.of(2005, 12, 1));
            studentRepository.saveAll(List.of(Oscar, Antonio));
        };
    }
}
