
import java.util.Calendar;

/**
 * A SalariedEmployee is:
 * 
 * 
 * @author jason
 */
public class SalariedEmployee extends Employee {
   
    private double annualSalary;
    private boolean isRetired;

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isIsRetired() {
        return isRetired;
    }

    public void setIsRetired(boolean isRetired) {
        this.isRetired = isRetired;
    }

    public SalariedEmployee(double annualSalary, boolean isRetired, long employeeId, String employeeName, String employeeDOB, String hireDate) {
        super(employeeId, employeeName, employeeDOB, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }   

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nAnnual Salary: ").append(annualSalary);
        sb.append("\nRetired? ").append(isRetired);
        
        return sb.toString();
    }
    
    /**
     * Retire the employee
     */
    public void retire(){
        
        Calendar c = Calendar.getInstance();
        
        StringBuilder sb = new StringBuilder();
        sb.append(c.get(Calendar.YEAR))
                .append(c.get(Calendar.MONTH))
                .append(c.get(Calendar.DATE));
        setIsRetired(true);
        
        terminate(sb.toString());
    }
}
