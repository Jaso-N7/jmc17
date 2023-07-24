package learn.s13;

import java.util.*;

import learn.s13.domain.*;

public class Main {

    public static void main (String [] args) {

	List<Employee> employees =
	    new LinkedList<>(List.of(
				     new Employee(10001, "Ralph", 2015),
				     new Employee(10005, "Carole", 2021),
				     new Employee(10022, "Jane", 2013),
				     new Employee(13151, "Laura", 2020),
				     new Employee(10050, "Jim", 2018)
));

	// Do sorting here
	// sort by name
	// employees.sort(new Employee.EmployeeComparator<>());
	// sort by year hired ascending
	// employees.sort(new Employee.EmployeeComparator<>("yearStarted"));
	// sort by year hired descending
	employees.sort(new Employee.EmployeeComparator<>("yearStarted")
		       .reversed());

	for(Employee e : employees) {
	    System.out.println(e);
	}

	System.out.println("\nStore Members");

	List<StoreEmployee> storeEmployees =
	    new LinkedList<>(List.of(
				     new StoreEmployee(10015, "Meg", 2019, "Target"),
				     new StoreEmployee(10515, "Joe", 2021, "Walmart"),
				     new StoreEmployee(10105, "Tom", 2020, "Macy's"),
				     new StoreEmployee(10215, "Marty", 2018, "Walmart"),
				     new StoreEmployee(10322, "Bud", 2016, "Target")));

	// var storeComparator = new StoreEmployee().new StoreComparator<>();
	StoreEmployee.StoreComparator storeComparator = new StoreEmployee()
	    .new StoreComparator<>();
	
	storeEmployees.sort(storeComparator);

	for (StoreEmployee se : storeEmployees) {
	    System.out.println(se);
	}
    }
}
