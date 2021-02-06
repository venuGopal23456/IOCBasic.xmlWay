package com.example.demo1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.demo1")
@PropertySource("classpath:student-info.properties")
public class ApplicationConfig {

//    public Teacher newTeacher()
//    {
//        return new MathTeacher();
//    }
////    @Bean
//    public Principal newPrincipal()
//    {
//        Principal principal = new Principal();
//        return  principal;
//    }
//
//
//    @Bean
//public College newBean()
//{
//   College college = new College();
//   college.setPrincipal(newPrincipal());
//   college.setTeacher(newTeacher());
//   return college;
//}

}
