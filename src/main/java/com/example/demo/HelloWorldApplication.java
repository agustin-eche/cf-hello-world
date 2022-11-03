package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("Simple Sysout");
		System.err.println("Simple Error");
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
