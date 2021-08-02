package com.example.Second_demoMysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.Second_demoMysql.repository")
@SpringBootApplication
public class SecondDemoMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondDemoMysqlApplication.class, args);
	}

}
