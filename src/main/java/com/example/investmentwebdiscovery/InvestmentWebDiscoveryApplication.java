package com.example.investmentwebdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class InvestmentWebDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvestmentWebDiscoveryApplication.class, args);
    }

}
