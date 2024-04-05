package com.project.school.repository;

import com.project.school.model.Student;
import com.project.school.service.StudentService;
import com.project.school.utils.StudentUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class StudentRepositoryTest {

    @Mock
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    @Test
    public void saveStudent() {
        Student ravi = Student.builder().studentId(3).studentName("RaviTeja").build();
        studentRepository.save(ravi);
    }

    @Test
    public void deleteNullStudents() {
        studentService.deleteNullStudentNames();
    }

    @Test
    public void findStudentById() {
        studentService.findStudentById(3);
    }

    @Test
    public void findAllStudents() {
        studentService.findAllStudents();
    }

/*
    @Test
    public void TestFilterStudentMap(){
        StudentUtils studentUtils = new StudentUtils();
        Assertions.assertEquals(studentUtils.filterStudentMap(new Student(1,"Ravi",3),1),
                new Student(1,"Ravi",3));
    }*/

    @Test
    public void testStringBuilder(){
        StudentUtils studentUtils = new StudentUtils();
        studentUtils.builderTest("teja");
    }
}
