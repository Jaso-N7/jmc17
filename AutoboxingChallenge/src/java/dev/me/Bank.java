package dev.me;

import java.util.*;

public class Bank {

    private String name;
    private ArrayList<Customer> customers;

    public Bank (String name) {
	this.name = name;
	customers = new ArrayList<>();
    }
    
    public String getBankName () {
	return name;
    }

    /**
     * Add a new customer, if they are not already in the list
     * While the return type is void, messages may be printed to the console
     *
     * @param name - Customer's name
     */
    public void addCustomer (Customer c) {

	if (customers.contains(c)) {
	    System.out.println(c.getCustomerName() + " already exists!");
	} else {
	    customers.add(c);
	    System.out.println(c.getCustomerName() + " successfully created!");
	}
	
    } // addCustomer :: String -> System IO

    /**
     * Allow a customer to add a transaction, only if the customer
     * already exists.
     * While the return type is void, messages may be printed to the
     * console.
     *
     * @param c - Customer object
     * @param transaction - either the credit or debit on the customer's
     *                      account
     */
    public void addTransaction (Customer c, Double transaction) {
		
	if(customers.contains(c)) {
	    
	    c.setTransaction(transaction);
	    
	    System.out.println("Transaction recorded");
	} else {
	    System.out.println("Customer doesn't exist!");
	}
    } // addTransaction :: Customer Double -> System IO

    /**
     * Prints a statement, that includes the customer name, and the
     * transaction amounts.
     *
     * @param c - The Customer object
     *
     * @return Either a statement of transactions or a message stating
     *         that the customer does not exist.
     */
    public String printStatement(Customer c) {

	if (customers.contains(c) ) {
	    return c.toString();
	} else {
	    return "Customer doesn't exist!";
	}
    } // printStatement :: Customer -> System IO
}
