package dev.me;

import java.util.Random;
import java.util.Arrays;
import javax.swing.*;

public class ArraySorting {

    private int aLen;

    public ArraySorting(int arrayLength) {
	aLen = arrayLength;
    }

    public int getLength() {
	return aLen;
    }
    
    public static void main (String... args) {

	int len = 5;
	if ( args.length > 0 ) {
	    len = Integer.parseInt(args[0]);
	}

	System.out.println("Using an array length of " + len);
	
	ArraySorting as = new ArraySorting(len);
					   
	int [] newArray = generateRandomArrays(as.getLength());
	
	System.out.println("New: " + Arrays.toString(newArray));

	int [] copied = Arrays.copyOf(newArray, as.getLength());
	Arrays.sort(copied);
	System.out.println("Sorted: " + Arrays.toString(copied));

	int [] reversed = reverseArray(copied, as.getLength());
	System.out.println("Reversed: " + Arrays.toString(reversed));
	
	JOptionPane.showMessageDialog(null,
				      "New: " + Arrays.toString(newArray) +
				      "\nSorted: " + Arrays.toString(copied) +
				      "\nReversed: " + Arrays.toString(reversed),
				      "Array", 0);
	
	
	System.exit(0);
    }

    /**
     * Generates an array of random integers from 0 - 100
     *
     */
    private static int [] generateRandomArrays (int len) {

	Random r = new Random();

	int [] trArr = new int [len];
	for (int i = 0; i < len; i++) {
	    trArr[i] = r.nextInt(101);
	}

	return trArr;
    }

    /**
     * Reverses a sorted array
     *
     * @param sorted - An already sorted array of Integers
     * @return An array of integers of the same length of the input
     */
    private static int [] reverseArray (int [] sorted, int length) {

	int [] reversed = new int [length];
	int idx = length - 1;
	for (int num : sorted) {
	    reversed[idx] = num;
	    idx--;
	}

	return reversed;
    }
}
