package com.ivan.bauer.controllers;

import com.ivan.bauer.model.EnrolledDepartment;
import com.ivan.bauer.service.EnrolledInDepartment;
import com.ivan.bauer.dao.PostgreSQLdatabase;
import com.ivan.bauer.service.EnrolledInDepartment;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

@RestController
@EnableAutoConfiguration
public class EnrolledInDepartmentController {

    @RequestMapping(method = RequestMethod.GET, value="/check/enrolled/{dept_no}")

    @ResponseBody
    public ArrayList<EnrolledDepartment> listEnrolled(@PathVariable("dept_no") String dept_no) {

        ArrayList<EnrolledDepartment> enrolled = new ArrayList<>();
        enrolled = EnrolledInDepartment.listEnrolled(dept_no);

        return enrolled;


    }

}
