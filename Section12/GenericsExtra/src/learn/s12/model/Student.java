package learn.s12.model;

import java.util.*;

public class Student {

    private String name, course;
    private final int yearStarted;
    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C", "C++", "Clojure", "Java", "Common Lisp"};

    public Student () {
	int lastNameIndex = random.nextInt(65, 91);
	name = firstNames[random.nextInt(firstNames.length)] + " " + (char) lastNameIndex + '.';
	course = courses[random.nextInt(courses.length)];
	yearStarted = random.nextInt(2018, 2023);
    }

    public int getYearStarted() { return yearStarted; }

    @Override
    public String toString() {
	return "%-15s %-15s %d"
	    .formatted(name, course, yearStarted);
    }
    
}
