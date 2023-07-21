package learn.s12;

import java.util.*;

public class Main {

    public static void main (String [] args) {

	Student tim = new Student("Tim");
	Student [] students = {
	    new Student("Zach"),
	    new Student("Tim"),
	    new Student("Ann")
	};

	// This is made possible by implementing Comparable
	Arrays.sort(students);
	System.out.println(Arrays.toString(students));

	System.out.println("result = " + tim.compareTo(new Student("TIM")));

	Comparator<Student> gpaSorter = tim.new StudentGPAComparator();
	Arrays.sort(students, gpaSorter.reversed());
	System.out.println(Arrays.toString(students));
    }

}

/* Use Comparable when you have a natural order */
class Student implements Comparable< Student > {

    private static int LAST_ID = 1_000;
    private static Random random = new Random();
    
    private String name;
    private int id;
    private double gpa;
    
    public Student (String name) {
	this.name = name;
	id = LAST_ID++;
	gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public String toString() {
	return "%d - %s (%.2f)"
	    .formatted(id, name, gpa);
    }

    @Override
    public int compareTo(Student s) {
	// return name.compareTo(s.name); // Sort by name
	return Integer.valueOf(id).compareTo(Integer.valueOf(s.id));
    }

    class StudentGPAComparator implements Comparator< Student > {

	@Override
	public int compare(Student s1, Student s2) {
	    return (s1.gpa + s1.name).compareTo(s2.gpa + s2.name);
	}
    }
    
    /* Until we can rectify the Erasure exception, we will comment out the
     * Comparable raw version
     *
    @Override
    public int compareTo(Object obj) {
	//	Student other = (Student) obj;
	return name.compareTo(((Student) obj).name);
    }
    */
}
