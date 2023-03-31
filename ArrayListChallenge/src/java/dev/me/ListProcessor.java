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
	String item = scanner.nextLine();

	if (item.contains(",")) {
	    String [] items = item.split(",");

	    for ( String i : items ) {
		gList.add( i.trim() );
	    }
	} else { gList.add( item ); }

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
	String answer = scanner.nextLine();

	if (answer.contains(",")) {
	    String [] items = answer.split(",");

	    for ( String item : items ) {
		gList.remove( item.trim() );
	    }
	} else {
	    gList.remove( answer.trim() );
	}


	System.out.println();
	System.out.println("Groceries: " + gList);
	System.out.println();
    } // remove
}
