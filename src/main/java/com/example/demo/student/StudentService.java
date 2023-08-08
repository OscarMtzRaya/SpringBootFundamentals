package com.example.demo.student;

import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.List;

@Component
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Oscar", "oscar@gmail.com", LocalDate.of(2000, 12, 1), 21)
        );
    }
}
