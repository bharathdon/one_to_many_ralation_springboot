package com.virtusa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"com.virtusa",
		"com.repository",
		"com.entity",
		"com.dao",
		"com.controller"})
@EntityScan(basePackages = {"com.virtusa","com.repository","com.entity","com.dao","com.controller"})
@EnableJpaRepositories(basePackages = "com")
public class OneToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

}
