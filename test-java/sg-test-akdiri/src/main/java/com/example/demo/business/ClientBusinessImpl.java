package com.example.demo.business;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Client;
import com.example.demo.models.Operation;

public class ClientBusinessImpl implements ClientBusiness {
	
	@Autowired
	private DaoService daoService;

	@Override
	public void makeDeposit(long clientId, double amount) {
		Client client = getClient(clientId);
		client.makeDeposit(amount);
		
	}

	@Override
	public void makeWithDrawal(long clientId, double amount) {
		Client client = getClient(clientId);
		client.makeWithDrawal(amount);
	}

	@Override
	public Operation[] getHistory(long clientId) {
		Client client = getClient(clientId);
		return (Operation[]) client.getOperations().toArray();
	}
	
	private Client getClient(long clientId) {
		return this.daoService.getClient(clientId);
	}

}
