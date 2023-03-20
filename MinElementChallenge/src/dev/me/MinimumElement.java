package dev.me;

import java.util.*;

public class MinimumElement {

    public static void main (String[] elements) {

	if (elements.length == 0) {
	    
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter a list of comma-separated numbers: ");

	    displayResults( readIntegers(s.nextLine().split(",")) );
	    

	} else {
	    displayResults( readIntegers(elements[0].split(",")) );
	}

	System.exit(0);
	
    }

    /**
     * @return An array of numbers entered by the user
     */
    private static int [] readIntegers(String... ints) {

	int [] numbers = new int[ints.length];
	for (int i = 0; i < ints.length; i++) {
	    numbers[i] = Integer.parseInt(ints[i].trim());
	}
	    
	return numbers;
    }

    private static int findMin(int [] ints) {

	int min = ints[0];

	for (Integer i : ints) {

	    if ( i < min ) {
		min = i;
	    }
	}
	return min;
    }

    private static void displayResults(int [] integers) {

	System.out.println(Arrays.toString(integers));

	int minimumInt = findMin( integers );
	System.out.println("The minimum integer is = " + minimumInt);
    }
}
