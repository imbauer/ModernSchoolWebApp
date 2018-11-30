package com.ivan.bauer.controllers;

import com.ivan.bauer.model.Student;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import com.ivan.bauer.service.EnrolledInUniversity;

import java.util.ArrayList;

@RestController
@EnableAutoConfiguration
public class EnrolledInUniversityController {

    @RequestMapping(method = RequestMethod.GET, value="/university/records")

    @ResponseBody
    public ArrayList<Student> getStudents() {

        EnrolledInUniversity enrolled = new EnrolledInUniversity();
        return enrolled.getStudents();

    }

}
