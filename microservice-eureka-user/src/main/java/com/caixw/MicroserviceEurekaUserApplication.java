package com.caixw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class MicroserviceEurekaUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEurekaUserApplication.class, args);
	}

}
