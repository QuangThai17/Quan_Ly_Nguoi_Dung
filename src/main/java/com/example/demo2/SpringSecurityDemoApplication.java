package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication//(exclude = SecurityAutoConfiguration.class)
public class SpringSecurityDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityDemoApplication.class, args);
        //
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        String rawPassword = "123456";
//        String encodedPassword = encoder.encode(rawPassword);
//
//        System.out.println(encodedPassword);

    }



}
