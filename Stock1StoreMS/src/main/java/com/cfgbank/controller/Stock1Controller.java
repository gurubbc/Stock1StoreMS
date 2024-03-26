package com.cfgbank.controller;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.cfgbank.model.Stock1;
import com.cfgbank.model.Stock1Service;


@RestController
public class Stock1Controller {

	@Autowired
	Stock1Service cs;

	@RequestMapping(value="/stock", method=RequestMethod.POST)
	public String addACustomer(@RequestBody Stock1 stock1) {
//		TimeZone.setDefault(TimeZone.getTimeZone("Africa/Casablanca"));
		long oneHour=60*60*1000;
		System.out.println("currentTimeMillis "+System.currentTimeMillis());
		System.out.println("One hour minus "+(System.currentTimeMillis()-oneHour));
		stock1.setLastUpdate(new java.sql.Timestamp(System.currentTimeMillis()-oneHour));
		return cs.addAStock(stock1);
	}

}
