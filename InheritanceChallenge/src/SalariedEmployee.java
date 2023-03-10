
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

    public boolean isRetired() {
        return isRetired;
    }

    public void setIsRetired(boolean isRetired) {
        this.isRetired = isRetired;
    }

    public SalariedEmployee(double annualSalary, boolean isRetired, long employeeId,
            String employeeName, String employeeDOB, String hireDate) {
        super(employeeName, employeeDOB, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }   

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nAnnual Salary: \u0024").append(annualSalary).append("\u00A2");
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
                .append("/");
        
        int month = c.get(Calendar.MONTH);
        String m = (month < 10) ? "0" + ++month : "" + month++;
        
        sb.append(m)
            .append("/")
            .append(c.get(Calendar.DATE));
        
        setIsRetired(true);
        
        terminate(sb.toString());
    }
    
    /**
     * Calculates the monthly pay for the salaried employee. Also takes into
     * account if the employee has retired or not.
     * 
     * @return Salaried Employee's monthly paycheck
     */
    @Override
    public double collectPay(){
        double salary = annualSalary / 12;
        
        return isRetired ? salary * 0.9 : salary;
    }
}
