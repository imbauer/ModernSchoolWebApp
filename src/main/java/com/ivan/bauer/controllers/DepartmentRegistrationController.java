package com.ivan.bauer.controllers;

import com.ivan.bauer.model.*;
import com.ivan.bauer.service.ConfirmRecords;
import com.ivan.bauer.service.DepartmentRegistration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class DepartmentRegistrationController {

    @RequestMapping(method = RequestMethod.GET, value="/department/registration/{dept_no}/{student_id}/{date}")

    @ResponseBody
    public Boolean enrollInDepartment(@PathVariable("dept_no") String dept_no, @PathVariable("student_id") String student_id, @PathVariable("date") String date) {

        Student student = ConfirmRecords.confirmStudent(student_id);
        Department department = ConfirmRecords.confirmDepartment(dept_no);

        if (student != null && department != null) {
            DepartmentRegistration.enroll(department, student, date);
            return true;
        }

        return false;
    }

}
