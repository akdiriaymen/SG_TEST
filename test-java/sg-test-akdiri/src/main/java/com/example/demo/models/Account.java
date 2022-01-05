package com.example.demo.models;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	private double amount;

	public Account(double amount) {
		super();
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void makeDeposit (double amount) {
		this.amount += amount;
	}
	
	public void makeWithDrawal (double amount) {
		this.amount -= amount;
	}

}
