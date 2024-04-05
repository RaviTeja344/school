package com.project.school.utils;

import com.project.school.model.Student;
import com.project.school.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class StudentUtils {

    @Autowired
    private StudentRepository studentRepository;

    public StudentUtils(){
        log.info("In Student Utils");
    }


    public Map<Student, Integer> filterStudentMap(Student student, int id) {

        Map<Student, Integer> studentMap = new HashMap<>();
        if (studentRepository.findById(id).get().getStudentId() == 3) {
            studentMap.put(student, student.getStudentId());
            log.info("student Map is {}", studentMap);
        } else {
            log.info("In No Map:");
        }
        return studentMap;
    }

    public String builderTest(String str){
        StringBuilder builder = new StringBuilder();
        String newString = builder.append(str).append("Hello").toString();
        System.out.println(newString);
        return newString;
    }
}
