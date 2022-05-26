package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import test.controller.HomeController;

import test.controller.HomeController;

@SpringBootApplication
@ComponentScan(basePackageClasses = TestController.class)
@ComponentScan(basePackageClasses = HomeController.class)
public class JspprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JspprojectApplication.class, args);
	}

}
