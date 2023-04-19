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
	BakedProduct bread = new BakedProduct("Bread", 350.00, "White / Hardough / Sliced");
	BakedProduct biscuit = new BakedProduct("Sandwich Cookies", 50.00, "Vanilla creme");
	CannedProduct tuna = new CannedProduct("Tuna", 400.56, "Chunks in Water");
	CannedProduct juice = new CannedProduct("Carrot", 156.78, "Carrot Juice");
	CleaningProduct beep = new CleaningProduct("Beep", 218.96, "Disinfectant Spray");
	CleaningProduct bleach = new CleaningProduct("Bleach", 564.52, "Disinfectant / Cleaner");

	System.out.print( s.storeFront() );
	
	do {
		    	    
	    switch (s.readLine.nextLine().toUpperCase()) {
	    case "V" -> {
		System.out.println("Viewing items - Not yet implemented");
		System.out.println("How would you like to proceed? [v/o/c/m/q]: ");
	    }
	    case "O" -> {
		System.out.println("Ordering - Not yet implemented");
		System.out.println("How would you like to proceed? [v/o/c/m/q]: ");
	    }
	    case "C" -> {
		System.out.println("Shopping Cart - Not yet implemented");
		System.out.println("How would you like to proceed? [v/o/c/m/q]: ");
	    }
	    case "M" -> System.out.print( s.storeFront() );
	    case "Q" -> System.exit( 0 );
	    default -> {
		System.out.println("Unrecognized command, please try again ...");
		System.out.println("How would you like to proceed? [v/o/c/m/q]: ");
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
	| [O]rder item                   |
	| [C]art                         |
	| [M]enu                         |
	| [Q]uit                         |
	+================================+
	 How would you like to proceed?  """;
    }
    /**
     *
     */
    public void addOrderItem () {} // printOrderItems :: Maybe System IO

    /**
     * Print ordered items so that it looks like a sales receipt.
     */
    public void printOrderItems () {} // printOrderItems :: System IO

    /**
     * Manage an order, which can just be a list of OrderItem objects
     */
    

}
