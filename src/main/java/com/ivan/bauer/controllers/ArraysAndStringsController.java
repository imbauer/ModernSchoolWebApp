package com.ivan.bauer.controllers;

import com.ivan.bauer.beans.ArraysAndStrings;
import com.ivan.bauer.beans.Student;
import com.ivan.bauer.beans.StudentRegistration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class ArraysAndStringsController {

    @RequestMapping(method = RequestMethod.GET, value="/unique/string/{str}")

    @ResponseBody
    public Boolean getUniqueResults(@PathVariable("str") String str) {
        return ArraysAndStrings.allUniqueString(str);
    }

    @RequestMapping("/test")
    public Connection gettingConnection() {
        //do something like logging
        return ArraysAndStrings.connDatabase();
    }

    @RequestMapping(method = RequestMethod.GET, value="/is/permutation/{first}/{second}")

    @ResponseBody
    public Boolean getperumtationResults(@PathVariable("first") String first, @PathVariable("second") String second) {
        return ArraysAndStrings.isPermutation(first, second);
    }
}
