package com.store.StoreServicesRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaServer
public class EurekaRegistryServer {

    public static void main(String[] args) {

        new SpringApplicationBuilder(EurekaRegistryServer.class).web(true).run(args);
    }
}
