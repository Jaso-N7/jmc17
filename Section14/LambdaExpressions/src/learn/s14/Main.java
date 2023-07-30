package learn.s14;

import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.function.*;

public class Main {

    public static void main (String[] args) {

	List< String > list =
	    new LinkedList<>(List.of("alpha", "bravo", "charlie", "delta"));

	System.out.println("Printing a List<String> with Enhanced For: ");
	for (String s : list) {
	    System.out.println(s);
	}

	System.out.println("-".repeat(7));
	System.out.println("Printing a List<String> with .forEach: ");
	list.forEach((s) -> System.out.println(s));

	System.out.println("-".repeat(7));
	System.out.println("Using .forEach with a final locally scoped variable:");
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

	System.out.println("Using BiConsumer:");
	var coords = Arrays.asList(
				   new double[]{47.2160, -97.2348},
				   new double[]{29.1566, -89.2495},
				   new double[]{35.1556, -90.0659});

	coords.forEach(coord -> System.out.println(Arrays.toString(coord)));

	BiConsumer<Double, Double> points = (lat, lng) ->
	    System.out.format("[lat:%.3f lon:%.3f]%n", lat, lng);
	double[] firstPoint = coords.get(0);
	processPoint(firstPoint[0], firstPoint[1], points);

	System.out.println("-".repeat(7));
	coords.forEach(coord -> processPoint(coord[0], coord[1], points));
	// Alternatively, using lambda directly in the method call
	coords.forEach(coord ->
		       processPoint(coord[0], coord[1],
				    (lat, lng) ->
				    System.out.format("[lat:%.3f lon:%.3f]%n", lat, lng)));

	System.out.println("--- Using Predicates ---");
	list.removeIf(s -> s.equalsIgnoreCase("bravo"));
	list.forEach(s -> System.out.println(s));

	list.addAll(List.of("echo", "easy", "earnest"));
	list.forEach(s -> System.out.println(s));

	System.out.println("-".repeat(7));
	list.removeIf(s -> s.startsWith("ea"));
	list.forEach(s -> System.out.println(s));
	
	System.out.println();
	System.exit(0);
    }

    /**
     * Conduct different operations on different types of data
     *
     */
    public static <T> T calculator(BinaryOperator<T> function,
				   T value1,
				   T value2) {
	T result = function.apply(value1, value2);
	System.out.println("Result of operation: " + result);
	return result;
    }

    public static <T> void processPoint(T point1, T point2,
					BiConsumer<T, T> consumer){
	consumer.accept(point1, point2);
    }
}
