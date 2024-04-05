package com.project.school.controller;

import com.project.school.model.Student;
import com.project.school.service.SimpleService;
import com.project.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private SimpleService simpleService;

    @PostMapping(value = "/addStudent")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping(value = "/getAllStudents")
    public List<Student> getAllStudents(){
        simpleService.print();
        return studentService.findAllStudents();
    }

    @GetMapping(value = "/findStudentById/{studentId}")
    public Student findStudentById(@PathVariable int studentId) {
         return studentService.findStudentById(studentId);
    }
}
