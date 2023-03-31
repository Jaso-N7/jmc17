package dev.me;

import java.util.*;

// record GroceryItem (String item) {}

public class ListProcessor {

    private ArrayList<String> gList;
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

	List<String> list = List.of(items);
	gList.addAll( list );
	/*	for (String item : items) {
	    gList.add(item.trim()));
	    }
	*/

	System.out.println();
	System.out.println("Groceries: " + gList);
	System.out.println();
	
    } // cons

    /**
     * Remove item(s) to the list
     */
    public void remove () {

	if (gList.size() == 0) {
	    System.out.println();
	    System.out.println("Nothing to remove, please add an item first");
	    System.out.println();

	    return;
	}
	
	System.out.println("Remove any items (comma delimited list): ");
	String [] items = scanner.nextLine().split(",");
	gList.removeAll(List.of(items));

	System.out.println();
	System.out.println("Groceries: " + gList);
	System.out.println();
    } // remove
}
