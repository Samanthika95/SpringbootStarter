package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class FirstApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(FirstApp1Application.class, args);
		System.out.println("Welcome");
	}

}
