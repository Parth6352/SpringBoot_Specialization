package com.htrap.day_1_first;

// Assignment 1
// An Api to return a static String in JSON with SpringBoot, It should have this URL "localhost:8080/getString"

		import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day1FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day1FirstApplication.class, args);
	}

}
