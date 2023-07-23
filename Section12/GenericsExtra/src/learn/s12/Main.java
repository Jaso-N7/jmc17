package learn.s12;

import java.util.*;

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
