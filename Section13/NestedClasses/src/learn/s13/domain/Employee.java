package learn.s13.domain;

import java.util.Comparator;

public class Employee {

    public static class EmployeeComparator <T extends Employee>
	implements Comparator<Employee> {

	private String sortBy;

	public EmployeeComparator() {
	    this("name");
	}

	public EmployeeComparator(String sortBy) {
	    this.sortBy = sortBy;
	}

	@Override public int compare(Employee e1, Employee e2) {

	    if (sortBy.equalsIgnoreCase("yearStarted")) {
		return e1.yearStarted - e2.yearStarted;
	    }
	    
	    return e1.name().compareTo(e2.name());
	}
    }
    
    private int employeeId, yearStarted;
    private String name;

    public Employee () {
    }

    public Employee(int empId, String fullName, int yearHired) {
	employeeId = empId;
	name = fullName;
	yearStarted = yearHired;
    }

    public String name() {
	return name;
    }

    @Override public String toString() {
	return "%d %-8s %d".formatted(employeeId, name, yearStarted);
    }
    
}
