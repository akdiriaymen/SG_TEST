package com.example.demo.models;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {
	@Autowired
	private Account account;
	
	private ArrayList<Operation> operations;

	public Client(Account account, Operation[] operations) {
		super();
		this.account = new Account(0);
		this.operations = new ArrayList<>();
	}

	public ArrayList<Operation> getOperations() {
		return operations;
	}

	public void setOperations(ArrayList<Operation> operations) {
		this.operations = operations;
	}
	
	public void makeDeposit (double amount) {
		this.account.makeDeposit(amount);
		this.operations.add(new Operation("DEPOSIT", new Date(), amount));
	}
	
	public void makeWithDrawal (double amount) {
		this.account.makeWithDrawal(amount);
		this.operations.add(new Operation("WithDrawal", new Date(), amount));
	}
}
