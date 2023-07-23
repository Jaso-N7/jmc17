package dev.me;

import java.util.*;

public class MinimumElement {

    public static void main (String[] args) {
	    
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a list of comma-separated numbers: ");

	String [] inputs = s.nextLine().split(",");
	int [] integers = readIntegers(inputs);
	displayResults( integers );

	System.out.println("Reversed: " + Arrays.toString(reverse( integers )));

	System.out.println("After reverse by copy: " + Arrays.toString(integers));
	System.exit(0);
	
    }

    private static int [] reverse (int [] arr) {

	int [] reversed = new int [arr.length];
	int idx = arr.length - 1;
	
	for( Integer a : arr ){
	    reversed[idx--] = a;
	}

	return reversed;
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
