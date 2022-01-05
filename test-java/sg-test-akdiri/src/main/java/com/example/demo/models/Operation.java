package com.example.demo.models;
 
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Operation {
	
	private String operation;
	
	private Date date;
	
	private double amount;
	
	public Operation(String operation, Date date, double amount) {
		super();
		this.operation = operation;
		this.date = date;
		this.amount = amount;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
