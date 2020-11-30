package com.proyects.microservices.app.billsmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.proyects.microservices.app.commonsmicroservice.models"})
public class BillsMicroserviceApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(BillsMicroserviceApplication.class, args);
	}

}
