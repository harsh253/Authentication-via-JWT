package com.sapient.authservice;


import com.sapient.authservice.entities.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AuthServiceApplication  {



	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}

//	@Override
//	public void run(String[] args) throws Exception {
//
//		userRepository.deleteAll();
//
//		userRepository.save(new Users(1, "Alice", "12345", "USER"));
//		userRepository.save(new Users(2, "Smith", "12345", "ADMIN"));
//	}
////
//		System.out.println("Customer found with findAllUsers():");
//		System.out.println("--------------------------------");
//		System.out.println(userRepository.findAllUsers());
//	}

}
