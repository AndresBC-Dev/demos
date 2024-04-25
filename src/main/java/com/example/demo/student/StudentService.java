package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(new Student(
                1L,
                "Andres",
                "andresbuit@gmail.com",
                LocalDate.of(1998, 04, 27),
                26
        ), new Student(
                2L,
                "jefry",
                "jefry@gmail.com",
                LocalDate.of(2002,05,03),
                23
        ));
    }
}
