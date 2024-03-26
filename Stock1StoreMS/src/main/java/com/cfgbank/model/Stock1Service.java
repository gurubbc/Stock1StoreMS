package com.cfgbank.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Stock1Service {

	@Autowired
	Stock1Repository stock1Repository;

	public Stock1Service() {
		System.out.println("Stock1Repository object is created");
	}

	public String addAStock(Stock1 stock1) {
		// This will generate the required SQL at the back end
		stock1Repository.save(stock1);
		return "Customer object is successfully stored";
	}

	

}
