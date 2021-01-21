package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {


    //Adding Default constructor will work to create Bean
//while using constructor to create bean we need this default constructor
    public Human()
    {}

    //We can add @Autowired and @Qualifier Here in that case it wont Print sout inside the setter method
    //because spring is not using setter method for dependency injection
    @Autowired
    @Qualifier("octopusObject")
    private Heart heart;

//while using constructor to inject dependency of heart
//    @Autowired
//    public Human(Heart heart) {
//        this.heart = heart;
//    }

//while using byName and byType Injection and also Autowire inside this same class for Setter Injection

//    public void setHeart(Heart heart) {
//        this.heart = heart;
//        System.out.println("Setter Method is Called");
//    }

    public void getOrgan(){
        heart.getBeating();
        System.out.println("My name is " + heart.getName() +" My Roll NO is " + heart.getRollNo());
    }
}
