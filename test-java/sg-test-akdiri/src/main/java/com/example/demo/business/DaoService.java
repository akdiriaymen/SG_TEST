package com.example.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.models.Client;

@Component
public class DaoService {
	@Autowired
	private Client client;
	
	public Client getClient(long id) {
		return client;
	}

}
