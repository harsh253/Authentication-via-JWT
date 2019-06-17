package com.sapient.usercreateservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class UserCreateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCreateServiceApplication.class, args);
	}

}
