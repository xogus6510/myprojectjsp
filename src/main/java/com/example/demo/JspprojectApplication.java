package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = TestController.class)
public class JspprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JspprojectApplication.class, args);
	}

}
