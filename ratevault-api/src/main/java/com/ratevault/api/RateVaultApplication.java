package com.ratevault.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RateVaultApplication {

	public static void main(String[] args) {

		SpringApplication.run(RateVaultApplication.class, args);
		System.out.println("hello");
	}

}
