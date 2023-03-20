package dev.me;

import java.util.*;

public class MinimumElement {

    public static void main (String[] elements) {

	if (elements.length == 0) {
	    System.out.println("Usage: java [-cp ...] MinimumElement n,n1,n2,...");
	    System.out.println("Where N represents any natural number.\nNote there are no spaces between the commas and numbers.");
	    System.exit(-1);
	}
	
	int [] integers = readIntegers(elements[0].split(","));
	System.out.println(Arrays.toString(integers));

	int minimumInt = findMin( integers );
	System.out.println("The minimum integer is = " + minimumInt);
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

	int min = ints[0];

	for (Integer i : ints) {

	    if ( i < min ) {
		min = i;
	    }
	}
	return min;
    }
}
