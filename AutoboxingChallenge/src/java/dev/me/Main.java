package dev.me;

public class Main {

    public static void main (String [] args) {

	// Create two banks
	Bank bns = new Bank("Bank of Nova Scotia");
	Bank jn = new Bank("Jamaica National");
	
	// Create and a few customers
	Customer c1 = new Customer("B. P.");
	Customer c2 = new Customer("G. H.");
	Customer c3 = new Customer("T. M.");
	Customer c4 = new Customer("D. S.");
	
	// Assign customers to banks
	bns.addCustomer(c1);
	bns.addCustomer(c2);
	jn.addCustomer(c3);
	jn.addCustomer(c4);
	
	// Conduct transactions per customer
	// Print statements
	System.out.println(bns.getBankName() +
			   "'s Customer (c1) " +
			   c1.getCustomerName());
	System.out.println(bns.printStatement(c1));
    }
}
