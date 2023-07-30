package learn.s14;

import java.util.List;
import java.util.LinkedList;
import java.util.function.*;

public class Main {

    public static void main (String[] args) {

	List< String > list =
	    new LinkedList<>(List.of("alpha", "bravo", "charlie", "delta"));
	
	for (String s : list) {
	    System.out.println(s);
	}

	System.out.println("-".repeat(7));
	list.forEach((s) -> System.out.println(s));

	System.out.println("-".repeat(7));
	String prefix = "nato"; // an effectively final local scoped variable
	list.forEach(s -> {
		char first = s.toUpperCase().charAt(0);
		System.out.println(prefix + " " + s + " means " + first);
	    });

	System.out.println();
	System.out.println("---- Just like LISP ----");
	// If you use an explicit type for one parameter, you must use
	// explicit types for all parameters
	int result = calculator((Integer a, Integer b) -> a + b,
				5, 2);
	// Paretheses are always required for multiple args.
	// Explicit types are not.
	var result2 = calculator((a, b) -> a / b, 10.0, 2.5);
	// If you use var for one parameter, you must use var for all
	// parameters
	var result3 = calculator((var a, var b) ->
				 a.toUpperCase() + " " + b.toUpperCase(),
				 "Ralph", "Kramden");
	
	System.out.println();
	System.exit(0);
    }

    /**
     * Conduct different operations on different types of data
     *
     */
    public static <T> T calculator(Operation<T> function,
				   T value1,
				   T value2) {
	T result = function.operate(value1, value2);
	System.out.println("Result of operation: " + result);
	return result;
    }
}
