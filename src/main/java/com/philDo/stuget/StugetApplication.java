package com.philDo.stuget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class StugetApplication {

	public static void main(String[] args) {
		System.out.println("스프링부트 기동");
		SpringApplication.run(StugetApplication.class, args);
	}

}
