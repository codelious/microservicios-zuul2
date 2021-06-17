package com.codelious.microservicios.app.zuul.microservicioszuul2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class MicroserviciosZuul2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosZuul2Application.class, args);
	}

}
