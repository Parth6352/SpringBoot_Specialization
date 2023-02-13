package com.htrap.JPA2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Jpa2Application {
//UnsatisfiedDependencyException
	public static void main(String[] args) {
		SpringApplication.run(Jpa2Application.class, args);
	}

}
