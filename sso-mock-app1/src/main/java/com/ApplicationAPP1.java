package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class ApplicationAPP1 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationAPP1.class, args);
    }
}
