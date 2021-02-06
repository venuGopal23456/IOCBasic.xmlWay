package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("newBean")
public class College {

@Value("${name}")
private String name;
    @Autowired
    private Principal principal;
    @Autowired
    @Qualifier("scienceTeacher")
    private Teacher teacher;


    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void getBean()
    {
        principal.princy();
        teacher.MathTeacher();
        System.out.println("College Bean Created");
        System.out.println(name);
    }
}
