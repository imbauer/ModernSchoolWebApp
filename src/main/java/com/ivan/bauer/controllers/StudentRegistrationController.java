package com.ivan.bauer.controllers;

import com.ivan.bauer.service.StudentRegistration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import com.ivan.bauer.model.*;

@RestController
@EnableAutoConfiguration
public class StudentRegistrationController {

    @RequestMapping(method = RequestMethod.GET, value="/register/student/{student_id}/{name}/{fin}/{age}")

    @ResponseBody
    public Student register(@PathVariable("student_id") String student_id,
                            @PathVariable("name") String name,
                            @PathVariable("fin") String fin,
                            @PathVariable("age") String age) {
        Student student = new Student(student_id, name, fin, age);
        StudentRegistration.register(student);
        return student;
    }

}