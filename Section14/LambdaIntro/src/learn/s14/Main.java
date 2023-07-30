package learn.s14;

import java.util.*;
import javax.swing.*;

public class Main {

    // implicitly static when used Inner
    record Person (String firstName, String lastName) {

	@Override
	    public String toString () {
	    return firstName + " " + lastName;
	}
    }

    public static void main (String[] args) {

	List< Person > people =
	    new LinkedList<>(Arrays.asList(
					   new Main.Person("Lucy", "Van Pelt"),
					   new Person("Sally", "Brown"),
					   new Person("Linus", "Van Pelt"),
					   new Person("Peppermint", "Patty"),
					   new Person("Charlie", "Brown")));

	// Using anonymous class
	/*
	var comparatorLastName = new Comparator< Person >() {
		@Override
		public int compare(Person p1, Person p2) {
		    return p1.lastName().compareTo(p2.lastName());
		}
	    };
	people.sort(comparatorLastName);
	*/

	// Using lambda expression
	people.sort((p1, p2) -> p1.lastName().compareTo(p2.lastName()));
	
	System.out.println(people);
	JOptionPane.showMessageDialog(null, people.toString(),
				      "Charlie Brown Characters",
				      JOptionPane.INFORMATION_MESSAGE);

	// JDK16 feature
	interface EnhancedComparator<T> extends Comparator<T> {
	    int secondLevel(T o1, T o2);
	}

	var comparatorMixed =
	    new EnhancedComparator< Person >(){
		@Override
		public int compare(Person p1, Person p2) {
		    int result = p1.lastName().compareTo(p2.lastName());
		    return (result == 0) ? secondLevel(p1, p2) : result;
		}

		@Override
		public int secondLevel(Person p1, Person p2) {
		    return p1.firstName().compareTo(p2.firstName());
		}
	    };

	people.sort(comparatorMixed);

	System.out.println(people);
	JOptionPane.showMessageDialog(null, people.toString(),
				      "Charlie Brown Characters",
				      JOptionPane.INFORMATION_MESSAGE);
    }
}
