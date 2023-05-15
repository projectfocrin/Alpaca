package com.aplaca.cruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// when copying the project while changing name we have to match the name of the POM with the main class with first letter
// to be capital letter 
@SpringBootApplication
public class AlpacabackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlpacabackendApplication.class, args);
	}

}
