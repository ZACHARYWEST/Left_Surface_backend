package com.capstone.diverCapstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.capstone")
public class DiverCapstoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiverCapstoneApplication.class, args);
	}

}
