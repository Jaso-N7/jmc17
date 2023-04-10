package dev.me;

import java.util.ArrayList;

public class Customer {

    final private String name;
    private ArrayList<Double> transactions;
    
    public Customer (String name) {
	this.name = name;
	this.transactions = new ArrayList<>();
    }

    public String getCustomerName () {
	return name;
    }

    public void setTransaction (Double dtct) {
	transactions.add( dtct );
    }
    
    public String toString () {
	StringBuilder sb  = new StringBuilder(name + "'s transaction history:-\n");

	double sum = 0.0;
	for (double transaction : transactions) {
	    sb.append(String.format("$ %,.2f\u00A2 \n", transaction));
	    sum += transaction;
	}
	sb.append("=".repeat(7));
	sb.append(String.format("\nTotal     $%,.2f\u00A2", sum));

	return sb.toString();
    }
}
