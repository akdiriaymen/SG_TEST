package com.example.demo.business;

import com.example.demo.models.Operation;

public interface ClientBusiness {
	public void makeDeposit(long clientId, double amount);
	public void makeWithDrawal(long clientId, double amount);
	public Operation[] getHistory(long clientId);

}
