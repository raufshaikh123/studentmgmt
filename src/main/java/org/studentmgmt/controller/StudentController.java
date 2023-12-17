package org.studentmgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.studentmgmt.model.Student;
import org.studentmgmt.repository.StudentRepository;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(path = "/savestudent")
    public Student save(@RequestBody Student student) {
        return studentRepository.save(student);
    }

}

