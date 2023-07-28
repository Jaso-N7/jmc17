package dev.s13.domain;

import java.time.LocalDate;

public record Employee (String firstName, String lastName, LocalDate hireDate) {

    @Override
	public String toString() {

	return lastName + ", " + firstName + " Hired: " + hireDate;
    }
}
