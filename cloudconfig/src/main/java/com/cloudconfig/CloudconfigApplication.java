package com.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
public class CloudconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudconfigApplication.class, args);
	}

}
