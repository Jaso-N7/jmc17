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
    
    public static void main (String [] args) {

	Main m = new Main();

	var startHere = new Itinerary("Adelaide", 1374);
	System.out.println("New Itinerary: " + startHere);
	
	var list = new LinkedList<Itinerary>();
	ListProcessor lisp = new ListProcessor (startHere);
	lisp.setTown("Alice Springs", 2771);
	lisp.setTown("Brisbane", 971);
	lisp.setTown("Darwin", 3972);
	lisp.setTown("Melbourne", 877);
	lisp.setTown("Perth", 3923);	

	System.out.println( lisp );
	System.exit(0);
    }
}
