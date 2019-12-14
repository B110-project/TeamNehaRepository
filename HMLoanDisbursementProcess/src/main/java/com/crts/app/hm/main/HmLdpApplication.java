package com.crts.app.hm.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class HmLdpApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmLdpApplication.class, args);
		System.out.println("cliect ready");
	}
	//@LoadBalanced
	@Bean
	public RestTemplate rs() 
	{
		RestTemplate ret=new RestTemplate();
		return ret;
		
		
	}

}
