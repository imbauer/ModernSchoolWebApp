package com.ivan.bauer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.ivan.bauer.beans.*;

@Controller
public class StudentRegistrationController {

    @RequestMapping(method = RequestMethod.GET, value="/register/student/{student_id}/{name}/{fin}/{age}")

    @ResponseBody
    public Boolean register(@PathVariable("student_id") String student_id, @PathVariable("name") String name, @PathVariable("fin") String fin, @PathVariable("age") String age) {
        StudentRegistration.register(student_id, name, fin, age);
        return true;
    }

}