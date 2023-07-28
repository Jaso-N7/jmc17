package dev.s13.model;

import java.util.*;
import java.time.LocalDate;

import dev.s13.domain.Employee;

final public class EmployeeModel {

    private static Random r = new Random();
    private static List<Employee> emps = new LinkedList<>();
	
    public EmployeeModel () {
	emps.add(new Employee("Angus", "MacGyver",
			      LocalDate.of(r.nextInt(1981, 2023),
					   r.nextInt(1, 12),
					   r.nextInt(1, 25))));
	emps.add(new Employee("Pete", "Thornton",
			      LocalDate.of(r.nextInt(1981, 2023),
					   r.nextInt(1, 12),
					   r.nextInt(1, 25))));
	emps.add(new Employee("Jack", "Dalton",
			      LocalDate.of(r.nextInt(1981, 2023),
					   r.nextInt(1, 12),
					   r.nextInt(1, 25))));
	emps.add(new Employee("Murdoc", "",
			      LocalDate.of(r.nextInt(1981, 2023),
					   r.nextInt(1, 12),
					   r.nextInt(1, 25))));
    }

    public List<Employee> viewEmployees () {
	return emps;
    }

    @Override
    public String toString () {
	StringBuilder sb = new StringBuilder();

	for (var e : emps) {
	    sb.append("%-5s, %-5s Hired on: %3$tb %3$te, %3$tY%n"
		      .formatted(e.lastName(), e.firstName(), e.hireDate()));
	}

	return sb.toString();
    }
}
