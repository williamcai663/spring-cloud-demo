package com.caixw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableEurekaClient
@RestController
public class MicroserviceEurekaOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEurekaOrderApplication.class, args);
	}

   @RequestMapping("/home")
	public  String home(){
		return "hello world";
	}

}
