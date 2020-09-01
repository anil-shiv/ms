package com.shivaanta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DtdServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DtdServiceApplication.class, args);
	}

}
