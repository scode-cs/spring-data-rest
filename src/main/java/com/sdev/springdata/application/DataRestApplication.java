package com.sdev.springdata.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;

@ComponentScan("com.sdev.springdata")
@EntityScan("com.sdev.springdata.entity")
@EnableJpaRepositories("com.sdev.springdata.repository")
@SpringBootApplication
@Import(SpringDataRestConfiguration.class)
public class DataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataRestApplication.class, args);
	}

}
