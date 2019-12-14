package com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HmEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmEurekaServerApplication.class, args);
		System.out.println("EUREKA server-stater");
	}

}
