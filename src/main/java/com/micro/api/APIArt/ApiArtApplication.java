package com.micro.api.APIArt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ApiArtApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiArtApplication.class, args);
	}

}
