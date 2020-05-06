package com.intellect.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.intellect.api"})
public class HoldingDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoldingDetailsApplication.class, args);
	}

}
