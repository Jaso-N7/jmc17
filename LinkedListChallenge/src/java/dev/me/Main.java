package dev.me;

import java.util.*;

/**
 * Main class for the challenge
 */
public class Main {

    private static Scanner scanner;

    public Main () {
	scanner = new Scanner(System.in);
    }

    public static String readline () {
	return scanner.nextLine();
    }

    private static void displayMenu () {

	String menu = """
	    
	    +============================================+
	    | Available actions (select word or letter): |
	    | (F)orward                                  |
	    | (B)ackward                                 |
	    | (L)ist Places                              |
	    | (M)enu                                     |
	    | (Q)uit                                     |
	    +============================================+
	    
	    """;

	    System.out.println(menu);
    }
    
    public static void main (String [] args) {

	Main m = new Main();

	//	var startHere = new Itinerary("Sydney", 0);
	//	System.out.println("New Itinerary: " + startHere);
	
	//var list = new LinkedList<Itinerary>();
	ListProcessor lisp =
	    new ListProcessor (new Itinerary("Sydney", 0));
	lisp.setTown("Adelaide", 1374);
	lisp.setTown("Alice Springs", 2771);
	lisp.setTown("Brisbane", 971);
	lisp.setTown("Darwin", 3972);
	lisp.setTown("Darwin", 3972); // testing for duplicates
	lisp.setTown("Melbourne", 877);
	lisp.setTown("Perth", 3923);

	var list = lisp.listOfTowns().listIterator();
	
	displayMenu();
	while (true) {

	    String option = m.readline().toUpperCase();

	    switch (option.charAt(0)) {
	    case 'F' -> {
		if (list.hasNext()){
		    System.out.println( list.next() );
		} else {
		    System.out.println("At the end of the list");
		}
	    }
	    case 'B' -> {
		if (list.hasPrevious()){
		    System.out.println( list.previous() );
		} else {
		    System.out.println("At the start of the list");
		}
	    }
	    case 'L' -> {
		
		System.out.println( lisp.listOfTowns() );
	    }
	    case 'M' -> displayMenu();
	    case 'Q' -> System.exit(0);
	    default -> System.out.println("Unknow option...");
	    }
    
	}
	
    }
}
