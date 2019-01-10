package com.ivan.bauer.controllers;

import com.ivan.bauer.service.Login;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import com.ivan.bauer.model.*;

@RestController
@EnableAutoConfiguration
public class LoginController {

    @RequestMapping(method = RequestMethod.GET, value="/login/{name}/{fin}")

    @ResponseBody
    public Student login(@PathVariable("name") String name,
                            @PathVariable("fin") String fin) {
        Student student = new Student(null, name, fin, null);
        student = Login.login(student);
        return student;
    }

}