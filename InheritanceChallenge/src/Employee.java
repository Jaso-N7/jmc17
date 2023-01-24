
import java.util.Calendar;

/**
 *
 * @author jason
 */
public class Employee extends Worker {
    
    private long employeeId;
    private String hireDate;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Employee(long employeeId, String employeeName, 
            String employeeDOB, String hireDate) {
        
        super(employeeName, employeeDOB);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
        
    }
    
    public Employee(){
        this(0, "", "01/01/1980", "01/01/2001");
    }

    @Override
    public String toString() {
        return "\nEmployee Id: " + employeeId + "\n Hired on: " + hireDate;
    }
        
}
