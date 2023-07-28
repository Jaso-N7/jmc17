package dev.s13;

import java.util.*;
import java.time.*;

import dev.s13.domain.Employee;
import dev.s13.model.EmployeeModel;

public class Main {

    public static void main (String [] args) {

	EmployeeModel em = new EmployeeModel();
	System.out.println(em);

	for(var employee : em.viewEmployees()) {
	    System.out.println(employee);
	}
	
    }
}

