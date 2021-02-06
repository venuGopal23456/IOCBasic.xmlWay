package com.example.demo1;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{

    @Override
    public void MathTeacher() {
        System.out.println("I am your Maths Teacher");
    }
}
