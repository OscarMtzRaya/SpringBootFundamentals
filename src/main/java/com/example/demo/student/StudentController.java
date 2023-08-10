package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {
    private final StudentService _studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this._studentService = studentService;
    }
    @GetMapping
    public List<Student> getStudents() {
        return _studentService.getStudents();
    }
    @PostMapping
    public List<Student> postStudent(Student student) {
        return _studentService.getStudents();
    }
}
