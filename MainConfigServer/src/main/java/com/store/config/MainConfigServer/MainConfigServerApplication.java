package com.store.config.MainConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MainConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainConfigServerApplication.class, args);
	}
}
