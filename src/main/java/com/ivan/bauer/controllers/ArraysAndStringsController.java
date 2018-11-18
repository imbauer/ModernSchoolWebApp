package com.ivan.bauer.controllers;

import com.ivan.bauer.beans.ArraysAndStrings;
import com.ivan.bauer.beans.Student;
import com.ivan.bauer.beans.StudentRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ArraysAndStringsController {

    @RequestMapping(method = RequestMethod.GET, value="/unique/string/{str}")

    @ResponseBody
    public Boolean getUniqueResults(@PathVariable("str") String str) {
        return ArraysAndStrings.allUniqueString(str);
    }


    @RequestMapping(method = RequestMethod.GET, value="/is/permutation/{first}/{second}")

    @ResponseBody
    public Boolean getperumtationResults(@PathVariable("first") String first, @PathVariable("second") String second) {
        return ArraysAndStrings.isPermutation(first, second);
    }
}
