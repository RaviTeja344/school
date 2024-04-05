package com.project.school.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "student")
@Data
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence",sequenceName ="student_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")
    @Column(name ="student_id")
    private int studentId;
    @Column(name = "student_name")
    private String studentName;
}
