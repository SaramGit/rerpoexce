package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootRestDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestDataApplication.class, args);
	}

}
