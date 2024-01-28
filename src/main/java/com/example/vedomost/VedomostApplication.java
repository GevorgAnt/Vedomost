package com.example.vedomost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class VedomostApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(VedomostApplication.class, args);
    }

}
