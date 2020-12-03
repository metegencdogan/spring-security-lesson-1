package com.example.springsecuritylesson1.student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentManagementController {

    public static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Mete Gencdogan"),
            new Student(2, "Idil Dikbas"),
            new Student(3, "Emre Nazar")
    );


    @GetMapping("management/api/v1/students")
    public List<Student> getAllStudents() {
        return STUDENTS;
    }

    @PostMapping("management/api/v1/students/")
    public void registerNewStudent(@RequestBody Student student) {
        System.out.println(student);
    }

    @DeleteMapping("management/api/v1/students/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId) {
        System.out.println(studentId);
    }

    @PutMapping("management/api/v1/students/{studentId}")
    public void updateStudent(@PathVariable("studentId") Integer studentId, @RequestBody Student student) {
        System.out.println(String.format("%s %s", studentId, student));
    }
}
