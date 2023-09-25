package com.ciq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ciq"})
public class DbAppenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbAppenderApplication.class, args);
	}

}
