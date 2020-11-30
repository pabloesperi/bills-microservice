package com.proyects.microservices.app.billsmicroservice.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.proyects.microservices.app.commonsmicroservice.models.Bill;

@RepositoryRestResource(path = "bills")
public interface IBillDao extends PagingAndSortingRepository <Bill, Long>{
	
}
