package dev.me;

import java.util.*;

public class MinimumElement {

    public static void main (String[] elements) {

	if (elements.length == 0) {
	    System.out.println("Usage: java [-cp ...] MinimumElement n, n+1, n+2, ...");
	    System.out.println("Where N represents any natural number");
	    System.exit(-1);
	}
	
	int [] integers = readIntegers(elements[0].split(","));
	System.out.println(Arrays.toString(integers));

	System.exit(0);
    }

    /**
     * @return An array of numbers entered by the user
     */
    public static int [] readIntegers(String... ints) {

	int [] numbers = new int[ints.length];
	for (int i = 0; i < ints.length; i++) {
	    numbers[i] = Integer.parseInt(ints[i]);
	}
	    
	return numbers;
    }

    public static int findMin(int [] ints) {
	
	return 0;
    }
}
