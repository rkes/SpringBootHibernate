package com.rest.controllers;

import com.app.entity.Classes;
import com.app.entity.Student;
import com.app.services.SchoolService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @RequestMapping(value = "/test")
    public String getRes(){
        return "Hello World";
    }

    @RequestMapping(value="/addStudent",method = RequestMethod.POST)
    public ResponseEntity addStudent(@RequestBody Student student){
        schoolService.addStudentToClass(student);
        return new ResponseEntity(HttpStatus.OK);
    }
    @RequestMapping(value="/getStudent",method = RequestMethod.GET)
    public ResponseEntity getStudent(@RequestParam("id") String rollNum){
        return new ResponseEntity(schoolService.getStudent(rollNum),HttpStatus.OK);
    }
}
