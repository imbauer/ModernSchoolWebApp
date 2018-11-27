package com.ivan.bauer.controllers;

import com.ivan.bauer.beans.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class DepartmentEnrollmentController {

    @RequestMapping(method = RequestMethod.GET, value="/enroll/department/{dept_no}/{student_id}/{date}")

    @ResponseBody
    public Boolean enrollInDepartment(@PathVariable("dept_no") String dept_no, @PathVariable("student_id") String student_id, @PathVariable("date") String date) {

        Student student = ConfirmRecords.confirmStudent(student_id);
        Department department = ConfirmRecords.confirmDepartment(dept_no);

        if (student != null && department != null) {
            DepartmentEnrollment.enroll(department, student, date);
            return true;
        }

        return false;
    }

}
