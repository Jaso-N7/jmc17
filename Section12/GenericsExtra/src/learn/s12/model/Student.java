package learn.s12.model;

import java.util.*;

import learn.s12.util.*;

public class Student implements QueryItem {

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

    /**
     * Filter any student list by checking any field
     *
     * @param fieldName The field to filter against
     * @param value The value contained within the field
     * @return true if any matches were found; Otherwise false
     */
    @Override
    public boolean matchFieldValue(String fieldName, String value) {

	return switch(fieldName.toUpperCase()) {
	case "NAME" -> name.equalsIgnoreCase(value);
	case "COURSE" -> course.equalsIgnoreCase(value);
	case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
	default -> false;
	};
    }
}
