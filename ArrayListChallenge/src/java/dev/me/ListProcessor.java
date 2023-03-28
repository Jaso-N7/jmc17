package dev.me;

import java.util.*;

record GroceryItem (String item) {}

public class ListProcessor {

    private ArrayList<GroceryItem> gList;
    private Scanner scanner;

    public ListProcessor () {
	gList = new ArrayList<>();
	scanner = new Scanner(System.in);
    }
    
    /**
     * Add items to the list
     */
    public void cons () {
	
	System.out.println("Add item(s) to the list (comman delimited list): ");
	String [] items = scanner.nextLine().split(",");

	for (String item : items) {
	    gList.add(new GroceryItem(item.trim()));
	}

	System.out.println();
	System.out.println("Groceries: " + gList);
	System.out.println();
	
    } // cons

    /**
     * Remove item(s) to the list
     */
    public void remove () {
	System.out.println("Remove any items (comma delimited list): ");
    } // remove
}
