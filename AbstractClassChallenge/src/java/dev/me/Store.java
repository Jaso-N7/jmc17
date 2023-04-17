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
    private ArrayList<OrderItem> orderItems;

    public Store () {
	this(new ArrayList<ProductForSale>());
    }

    public Store (ArrayList<ProductForSale> productsForSale) {
	products = productsForSale;
	orderItems = new ArrayList<>();
    }
    
    
    public static void main (String [] args) {


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
