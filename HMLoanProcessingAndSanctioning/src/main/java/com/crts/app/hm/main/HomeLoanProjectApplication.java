package com.crts.app.hm.main;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/*import org.springframework.cloud.client.discovery.EnableDiscoveryClient;*/
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

import com.crts.app.hm.main.service.REServiceimpl;


@EntityScan
@EnableJpaRepositories
@SpringBootApplication
@EnableDiscoveryClient
public class HomeLoanProjectApplication {
	@Resource
	REServiceimpl storageService;

	public static void main(String[] args) {
		System.out.println("Starting the Application");
		SpringApplication.run(HomeLoanProjectApplication.class, args);
		System.out.println("Hit URL");
	}
	
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate rt = new RestTemplate();
		return rt;
	}

	@Bean
	public Logger logger() {
		Logger log = LogManager.getLogger();
		return log;
	}

	
	public void run(String... args) throws Exception 
	{
		storageService.deleteAll();
		storageService.init();
		
	}

}
