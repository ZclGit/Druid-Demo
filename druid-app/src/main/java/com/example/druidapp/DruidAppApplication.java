package com.example.druidapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = "com.example")
public class DruidAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DruidAppApplication.class, args);
	}
}
