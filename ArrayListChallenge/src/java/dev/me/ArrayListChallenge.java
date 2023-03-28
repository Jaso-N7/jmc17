package dev.me;

import java.util.*;

public class ArrayListChallenge {

    /**
     * Prints the menu to the screen
     *
     * @return String of the user's input
     */
    private static String menuOptions () {

	Scanner reader = new Scanner(System.in);
	String menu = """
	    Available actions:

	    0 - to shutdown

	    1 - to add item(s) to list (comma delimited list)

	    2 - to remove any item(s) (comma delimited list)

	    Enter a number for which action you want to do:
					 """;
	
	System.out.println(menu);
	
	return reader.nextLine();
	
    } // menuOptions :: String

    public static void main (String[] args) {

	ListProcessor lisp = new ListProcessor();
	
	while (true) {
	    String chosen = menuOptions();

	    switch (chosen) {
	    case "0" -> System.exit(0);
	    case "1" -> { lisp.cons(); }
	    case "2" -> { lisp.remove(); }
	    default -> {
		System.out.println("Unknown option, please choose again...");
	    }
	    }
	} // while T
    } // psvm
    
} // ArrayListChallenge :: Class
