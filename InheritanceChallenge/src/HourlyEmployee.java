/**
 *
 * @author jason
 */
public class HourlyEmployee extends Employee {
    
    private double hourlyPayRate;

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee(double hourlyPayRate, long employeeId, String employeeName, String employeeDOB, String hireDate) {
        super(employeeId, employeeName, employeeDOB, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        
        return "\nHourly Rate: \u0024" + hourlyPayRate + "\u00A2";
    }
    
    /**
     * Doubles the hourly pay
     * @return doubled hourly pay
     */
    public double getDoublePay(){
        return hourlyPayRate * 2;
    }
    
}