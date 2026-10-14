package com.example.student_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example")
@EntityScan(basePackages = "com.example.studentmanager.model")
@EnableJpaRepositories(basePackages = "com.example.studentmanager.repository")
public class StudentManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagerApplication.class, args);
	}

}
