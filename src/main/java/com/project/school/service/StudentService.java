package com.project.school.service;


import com.project.school.model.Student;
import com.project.school.repository.StudentRepository;
import com.project.school.utils.StatusCodes;
import com.project.school.utils.StudentUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StudentService extends StatusCodes {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentUtils studentUtils;

    public StudentService() {
        log.info("In Student Service");
    }


    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteNullStudentNames() {
        List<Student> studentList = studentRepository.findAll();
        for (Student s : studentList) {
            if (s.getStudentName().isEmpty() || s.getStudentName().isBlank()) {
                studentRepository.delete(s);
            }
        }
    }

    public List<Student> findAllStudents() {
        List<Student> studentList = studentRepository.findAll().stream().toList();
        log.info("Student List {}", studentList);
        return studentList;
    }

    public Student findStudentById(int studentId) {
        Student student = new Student();
        if (studentRepository.findById(studentId).isPresent()) {
            student = studentRepository.findById(studentId).get();
            log.info("StudentId:{} ,studentName{}", student.getStudentId(), student.getStudentName());
            return student;
        } else {
            log.info("Not Found");
            return null;
        }
        //return student;
    }
}
