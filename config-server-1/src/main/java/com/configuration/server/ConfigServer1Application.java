package com.configuration.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServer1Application.class, args);
	}

}
