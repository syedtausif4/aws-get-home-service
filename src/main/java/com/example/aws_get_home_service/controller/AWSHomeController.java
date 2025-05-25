package com.example.aws_get_home_service.controller;


import com.example.aws_get_home_service.service.AWSHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWSHomeController {

    @Autowired
    AWSHomeService awsHomeService;

    @GetMapping("/home")
    public String getHome(){

        return awsHomeService.getHome();
    }
}
