package dev.me;

import java.util.*;

record GroceryList (String item) {}

public class ListProcessor {

    private ArrayList<GroceryList> gList;
    
    /**
     * Add items to the list
     */
    public void cons () {
	System.out.println("Add item(s) to the list (comman delimited list): ");
    } // cons

    /**
     * Remove item(s) to the list
     */
    public void remove () {
	System.out.println("Remove any items (comma delimited list): ");
    } // remove
}
