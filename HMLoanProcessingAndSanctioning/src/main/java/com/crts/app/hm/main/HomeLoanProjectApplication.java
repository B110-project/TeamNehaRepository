package com.crts.app.hm.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;
@EnableJpaRepositories
@EntityScan
@EnableDiscoveryClient
@SpringBootApplication
public class HomeLoanProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeLoanProjectApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate rt=new RestTemplate();
		return rt;
	}
}
