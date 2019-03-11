package com.ivan.bauer.controllers;

import com.ivan.bauer.model.Student;
import com.ivan.bauer.model.StudentWithGrade;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import com.ivan.bauer.service.EnrolledInUniversity;

import java.util.ArrayList;

@RestController
@EnableAutoConfiguration
public class EnrolledInUniversityController {

    @RequestMapping(method = RequestMethod.GET, value="/university/records/{count}")
    @ResponseBody
    public ArrayList<StudentWithGrade> getStudents(@PathVariable("count") String count) {

        EnrolledInUniversity enrolled = new EnrolledInUniversity();
        return enrolled.getStudents(count);

    }

    @RequestMapping(method = RequestMethod.GET, value="/university/records/{count}/{dept}")
    @ResponseBody
    public ArrayList<StudentWithGrade> getStudentsDept(@PathVariable("count") String count, @PathVariable("dept") String dept) {

        EnrolledInUniversity enrolled = new EnrolledInUniversity();
        return enrolled.getStudentsDept(count, dept);

    }


}
