package learn.s12;

import java.util.*;

import learn.s12.util.*;
import learn.s12.model.*;

public class Main {

    public static void main(String[] args) {

	int studentCount = 10;
	List<Student> students = new LinkedList<>();
	for (int i = 0; i < studentCount; i++) {
	    students.add(new Student());
	}
	// printList(students);
	printMoreList(students);

	List<LPAStudent> lpas = new LinkedList<>();
	for (int i = 0; i < studentCount; i++) {
	    lpas.add(new LPAStudent());
	}
	// printList(lpas);
	printMoreList(lpas);

	testList(new ArrayList<String>(List.of("Alpha", "Bravo", "Charlie")));
	testList(new LinkedList<Integer>(List.of(2,4,6,8)));

	// Infers QueryList<LPAStudent>
	var queryList = new QueryList<>(lpas);
	// Infers List<LPAStudent>
	var matches = queryList.getMatches("Course", "Clojure");
	printMoreList(matches);

	// Infers List<Student>
	var students2021 = QueryList.getMatches(students, "YearStarted", "2021");
	printMoreList(students2021); // Get list of students enrolled in 2021
    }

    // Instead of method overloading with generics, use this version to overcome
    // type erasure, where you instead check for the type of or instanceof the
    // parameter being passed
    public static void testList(List<?> list) {

	for (var l : list) {
	    if(l instanceof String str) {
		System.out.println("String: " + str.toUpperCase());
	    } else if (l instanceof Integer nat) {
		System.out.println("Integer: " + nat.floatValue());
	    }
	}
    }

    // Implementing a Generic Method
    public static void printMoreList(List<? extends Student> students) {

	for(var student : students) {
	    System.out.println(student.getYearStarted() + ": " + student);
	}
	System.out.println();

    }
    /*
    // Implementing a Generic Method as a possible solution
    public static <T extends Student> void printList(List<T> students) {

	for(var student : students) {
	    System.out.println(student.getYearStarted() + ": " + student);
	}
	System.out.println();

    }
    */
}
