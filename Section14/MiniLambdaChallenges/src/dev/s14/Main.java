package dev.s14;

import java.util.*;
import java.util.function.*;

public class Main {

    public static void main (String[] args) {

	miniChallenge1();
    }

    private static void miniChallenge1() {
	/* Write the following anonymous class that you see on screen,
	 * as a lambda expression.

	 Consumer<String> printTheParts = new Consumer<String>() {
	     @Override
	     public void accept(String sentence) {
	         String[] parts = sentence.split(" ");
		 for(String part : parts) {
	             System.out.println(part);
		 }
	     }
	 };

	*/

	Consumer<String> printTheParts = (String sentence) -> 
	    Arrays.asList(sentence.split(" "))
	    .forEach(word -> System.out.println(word));

	printTheParts.accept("This was a sentence");
	
    }
}
