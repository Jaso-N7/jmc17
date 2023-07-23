import java.util.Calendar;

/**
 *
 * @author jason
 */
public class Employee extends Worker {
    
    private long employeeId;
    private String hireDate;
    // Used for generating employeeId;
    private static int employeeNo = 1;

    public long getEmployeeId() {
        return employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Employee(String employeeName, 
            String employeeDOB, String hireDate) {
        
        super(employeeName, employeeDOB);
        
        this.employeeId = Employee.employeeNo++;
        
        Calendar c = Calendar.getInstance();
        if(hireDate.isEmpty()){
            
            StringBuilder date = new StringBuilder();
            date.append(c.get(Calendar.YEAR));
            
            int month = c.get(Calendar.MONTH);
            String m = (month < 10) ? "0" + ++month : "" + month++;
            date.append(m)
                .append("/")
                .append(c.get(Calendar.DATE));
            
            this.hireDate = date.toString();
            
        } else {
            this.hireDate = hireDate;
        }
        
    }
    
    public Employee(){
        
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nEmployee Id: " + employeeId + 
                "\nHired on: " + hireDate;
    }
        
}
