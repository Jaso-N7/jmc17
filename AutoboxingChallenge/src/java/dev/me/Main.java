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
	bns.addTransaction(c1, 1_001.05);
	bns.addTransaction(c2, 20_000);
	bns.addTransaction(c1, -499.95);
	bns.addTransaction(c2, 5_000.60);
	jn.addTransaction(c4, 5_402.74);
	jn.addTransaction(c4, -20.17);
	// Print statements
	/*	System.out.println(bns.getBankName() +
			   "'s Customer (c1) " +
			   c1.getCustomerName());
	*/
	System.out.println(bns.printStatement(c1));
	System.out.println("-".repeat(20));
	System.out.println(bns.printStatement(c2));
	System.out.println("-".repeat(20));
	System.out.println(jn.printStatement(c3));
	System.out.println("-".repeat(20));
	System.out.println(jn.printStatement(c4));
    }
}
