package com.example.aws_get_home_service.service;

import org.springframework.stereotype.Service;

@Service
public class AWSHomeServiceImpl implements AWSHomeService{
    @Override
    public String getHome() {
        return "Tausif AWS Project Home Page";
    }
}
