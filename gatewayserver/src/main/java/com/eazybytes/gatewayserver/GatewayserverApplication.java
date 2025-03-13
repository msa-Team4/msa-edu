package com.eazybytes.gatewayserver;

import java.time.Duration;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;

@SpringBootApplication
public class GatewayserverApplication {

	private static final Logger logger = LoggerFactory.getLogger(GatewayserverApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GatewayserverApplication.class, args);
	}
}
