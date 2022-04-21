package com.sdev.springdata.application;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan("com.sdev.springdata")
@EntityScan("com.sdev.springdata.entity")
@EnableJpaRepositories("com.sdev.springdata.repository")
@SpringBootApplication
//@Import(SpringDataRestConfiguration.class)
@OpenAPIDefinition(info = @Info(title = "Spring Data REST API", version = "1.0",
		description = "API for Spring Data REST"))
public class DataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataRestApplication.class, args);
	}

}
