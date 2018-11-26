package com.ivan.bauer.server.main;

import com.ivan.bauer.controllers.StudentRegistrationController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@WebMvcTest(StudentRegistrationController.class)
public class StudentRegistrationControllerTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void contextLoads() {
    }

//    @Test
//    public void getRegistrationResults() throws Exception {
//        Student student = new Student();
//        student.setName("Jared");
//        student.setAge(24);
//        student.setRegistrationNumber("2131241");
//        ObjectMapper mapper = new ObjectMapper();
//        mvc.perform(post("/register/student")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(mapper.writeValueAsString(student))
//                .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//    }

}
