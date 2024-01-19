package com.example.frcute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication(scanBasePackages = {"com.example.frcute"})
@Service("com.example.frcute.services")
@EnableJpaRepositories(basePackages = {"com.example.frcute.repos"})
@EntityScan(basePackages = {"com.example.frcute.entities"})

public class FrcuteApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrcuteApplication.class, args);
	}

}
