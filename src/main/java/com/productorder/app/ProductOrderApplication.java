package com.productorder.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.productorder")
@EnableEurekaClient
@EnableJpaRepositories(basePackages = "com.productorder.persistence")
@EntityScan(basePackages = "com.productorder.bean")
public class ProductOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductOrderApplication.class, args);
	}
}