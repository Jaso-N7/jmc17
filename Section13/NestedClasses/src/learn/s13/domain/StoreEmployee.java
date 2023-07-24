package learn.s13.domain;

import java.util.Comparator;

public class StoreEmployee extends Employee {

    private String store;

    public StoreEmployee () {}

    public StoreEmployee (int empId, String name, int yearStarted, String store) {
	super(empId, name, yearStarted);
	this.store = store;
    }

    @Override
    public String toString () {
	return "%-8s%s".formatted(store, super.toString());
    }
    
    public class StoreComparator <T extends StoreEmployee>
	implements Comparator<StoreEmployee> {

	@Override public int compare(StoreEmployee se1, StoreEmployee se2) {

	    // Check if they work at the same store
	    int result = se1.store.compareTo(se2.store);
	    if (result == 0) {
		return new Employee.EmployeeComparator<>("yearStarted")
		    .compare(se1, se2);
	    }
	    
	    return result;
	}
    }
}
