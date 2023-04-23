/*
 * A Store is a:
 *
 * Store s = new Store()
 *
 * INTERPRETATION: A store front, for any imaginable item for sale.
 * The Store can: -
 * 1. Manage a *list of products for sale* including displaying
 *    the product details.
 * 2. Manage an order, which can just be a *list of OrderItem*
 *    objects
 * 3. Methods to *add an item to the order*, and *print the ordered
 *    items* so it looks like a sales receipt.
 *
 */

package dev.me;

import java.util.*;

public class Store {

    private ArrayList<ProductForSale> products;
    private ArrayList<OrderItem> shoppingCart;
    private Scanner readLine;

    public Store () {
	products = new ArrayList<ProductForSale>(); // can set initial store capacity here
	shoppingCart = new ArrayList<OrderItem>(20); // shopping cart will initial hold up to 20 items
	readLine = new Scanner(System.in);
    }
    
    public static void main (String [] args) {

	// create a new Store
	Store s = new Store();

	// Decide on items that will be sold
	BakedProduct bread = new BakedProduct("Baked", 350.00, "Bread / White, Hardough, Sliced");
	BakedProduct biscuit = new BakedProduct("Baked", 50.00, "Sandwich Cookies / Vanilla creme");
	CannedProduct tuna = new CannedProduct("Canned", 400.56, "Tuna / Chunks in Water");
	CannedProduct juice = new CannedProduct("Canned", 156.78, "Carrot Juice");
	CleaningProduct beep = new CleaningProduct("Cleaning", 218.96, "Beep / Disinfectant Spray");
	CleaningProduct bleach = new CleaningProduct("Cleaning", 564.52, "Bleach / Disinfectant, Cleaner");

	s.addProduct(bread);
	s.addProduct(biscuit);
	s.addProduct(tuna);
	s.addProduct(juice);
	s.addProduct(beep);
	s.addProduct(bleach);
	
	System.out.print( s.storeFront() + " ");
	
	do {
		    	    
	    switch (s.readLine.nextLine().toUpperCase()) {
	    case "V" -> {
		s.viewProducts();
		System.out.println(s.miniMenu());
	    }
	    case "A" -> {
		s.addProduct();
		System.out.println(s.miniMenu());
	    }
	    case "O" -> {
		s.addOrderItem();
		System.out.println(s.miniMenu());
	    }
	    case "C" -> {
		s.printOrderItems();
		System.out.println(s.miniMenu());
	    }
	    case "M" -> System.out.print( s.storeFront() );
	    case "Q" -> System.exit( 0 );
	    default -> {
		System.out.println("Unrecognized command, please try again ...");
		System.out.println(s.miniMenu());
	    }
	    }
	}
	while (true);
	
    }

    private final String storeFront () {
	return """
	+================================+
	| Welcome to your One Stop Shop! |
	+================================+
	| [V]iew items                   |
	| [A]dd item                     |
	| [O]rder item                   |
	| [C]art / Checkout              |
	| [M]enu                         |
	| [Q]uit                         |
	+================================+
	    
	 How would you like to proceed?  """;
    }

    private final String miniMenu () {
	return "How would you like to proceed? [v/a/o/c/m/q]: ";
    }

    public void viewProducts () {

	for (ProductForSale p : products) {

	    p.showDetails();
	    System.out.println();
	}
    }

    /**
     * Updates store inventory with user input
     *
     * @return 0 - nothing was added / 1 - inventory updated
     */
    private int addProduct () {
	String type, price, description;
	System.out.println("Product Type [c to cancel]: ");
	type = readLine.nextLine();
	if (type.toLowerCase().equals("c")) {
	    return 0;
	}
	
	System.out.println("Cost($) [c to cancel]: ");
	price = readLine.nextLine();
	if (price.toLowerCase().equals("c")) {
	    return 0;
	}
	
	System.out.println("Description [c to cancel]: ");
	description = readLine.nextLine();
	if (description.toLowerCase().equals("c")) {
	    return 0;
	}

	return switch (type.toUpperCase()) {
	    case "BAKED" -> addProduct(new BakedProduct(type,
					 Double.parseDouble(price),
					 description));
	    case "CANNED" -> addProduct(new CannedProduct(type,
					  Double.parseDouble(price),
					  description));
	    default ->  addProduct(new CleaningProduct(type,
					  Double.parseDouble(price),
					  description));	    
	};
	
    }

    /**
     * Updates store inventory. Can either be invoked at class
     * creation or by another calling program.
     *
     * @return - 0 - nothing added / 1 - inventory updated
     */
    private int addProduct (ProductForSale inventory) {
	
	if (products.contains(inventory)) {
	    return 0;
	} else {
	    products.add(inventory);
	    return 1;
	}
    }
    
    /**
     * Add a specified amount of item(s) to the Shopping Cart
     *
     * @param product - An object containing the details of the product
     * @param amount - how much of the product to be purchased
     */
    public void addOrderItem (ProductForSale product, double amount) {

	shoppingCart.add(new OrderItem(amount, product));
	
    } // printOrderItems :: Maybe System IO

    public void addOrderItem () {

	for (int idx = 0; idx < products.size(); idx++) {
	    System.out.print(idx + " - ");
	    products.get(idx).showDetails();
	    System.out.println();
	}

	System.out.println("Choose product by Number: ");
	int choice = Integer.parseInt( readLine.nextLine() );
	System.out.println("Amount: ");
	int amount = Integer.parseInt( readLine.nextLine() );

	addOrderItem(products.get(choice), amount);

    }

    /**
     * Print ordered items so that it looks like a sales receipt.
     */
    public void printOrderItems () {

	double qty = 0.0d;
	
	for(OrderItem i : shoppingCart) {
	    qty = i.quantity();
	    System.out.println(qty + "x " + i.product().printLineItem(qty));
			       
	}
    } // printOrderItems :: System IO

    /**
     * Manage an order, which can just be a list of OrderItem objects
     */
    

}
