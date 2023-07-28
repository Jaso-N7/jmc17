package dev.s13;

import java.util.*;
import java.time.*;

import dev.s13.domain.Employee;
import dev.s13.model.EmployeeModel;

public class Main {

    public static void main (String [] args) {

	// Setup a list of Employees with various names and hire dates
	EmployeeModel em = new EmployeeModel();
	// confirm that em was successfully generated
	// System.out.println(em);

	var employees = em.viewEmployees();
	
	for(var employee : employees) {
	    System.out.println(employee);
	}

	var tenures = employeeTenure( employees );
	System.out.println(tenures);
    }

    /**
     * Calculates the tenure of employees
     *
     * @param employees A list of all employees
     *
     * @return A list of the employees with the years they have been employed
     */
    public static List<Employee> employeeTenure (List<Employee> employees) {

	class Tenure {

	    private String fullName;
	    private int yearsWorked;
	    private Employee employee;

	    public Tenure (Employee e) {
		employee = e;
		fullName = e.firstName() + " " + e.lastName();
		yearsWorked = LocalDate.now().getYear() - e.hireDate().getYear();
	    }

	    @Override
	    public String toString() {
		return "Fullname: " + fullName + " employeed for " + yearsWorked
		    + " years.";
	    }

	} // end of Local Class Tenure

	List<Tenure> years = new LinkedList<>();
	
	for (var e : employees) {
	    years.add( new Tenure(e) );
	}

	return years;
    }
}

