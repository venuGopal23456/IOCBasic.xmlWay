package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component

public class ScienceTeacher implements Teacher {

    @Override
    public void MathTeacher() {
        System.out.println("I am your science Teacher");
    }
}
