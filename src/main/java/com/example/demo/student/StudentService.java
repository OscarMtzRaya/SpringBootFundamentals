package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.List;

@Component
public class StudentService {
    private final StudentRepository _studentRepository;
    @Autowired
    public StudentService(StudentRepository _studentRepository) {
        this._studentRepository = _studentRepository;
    }

    public List<Student> getStudents() {
        return _studentRepository.findAll();
    }
}
