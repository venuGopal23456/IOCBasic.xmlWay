package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {


    //In case if we move the @value at variable level we dont need setter method like the example below
    //@Value("${odd.name}")
    private String name;
    private String Id;
    private String subject;

    public String getName() {
        return name;
    }

    @Value("${odd.name}")
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }
    @Value("123")
    public void setId(String id) {
        Id = id;
    }

    public String getSubject() {
        return subject;
    }

    @Value("Maths")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void Studentinfo()
    {
        System.out.println("Name" + name + "Id"  + Id  + "Subject" + subject);
    }
}
