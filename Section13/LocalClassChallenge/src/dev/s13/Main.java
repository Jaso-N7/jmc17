package dev.s13;

import java.util.*;
import java.time.*;

import dev.s13.domain.Employee;

public class Main {

    public static void main (String [] args) {

	Random r = new Random();
        
	List<Employee> employees = new LinkedList<>();
	employees.add(new Employee("Angus", "MacGyver",
				     LocalDate.of(r.nextInt(1981, 2023),  r.nextInt(1, 12), r.nextInt(1, 25))));
	employees.add(new Employee("Pete", "Thornton",
				     LocalDate.of(r.nextInt(1981, 2023),  r.nextInt(1, 12), r.nextInt(1, 25))));
	employees.add(new Employee("Jack", "Dalton",
				     LocalDate.of(r.nextInt(1981, 2023),  r.nextInt(1, 12), r.nextInt(1, 25))));
	employees.add(new Employee("Murdoc", "",
				     LocalDate.of(r.nextInt(1981, 2023),  r.nextInt(1, 12), r.nextInt(1, 25))));

	for(var employee : employees) {
	    System.out.println(employee);
	}
	
    }
}
