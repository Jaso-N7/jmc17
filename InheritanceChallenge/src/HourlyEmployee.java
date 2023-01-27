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

    public HourlyEmployee(double hourlyPayRate, long employeeId, String employeeName,
            String employeeDOB, String hireDate) {
        super(employeeName, employeeDOB, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        
        return super.toString() + "\nHourly Rate: \u0024" + hourlyPayRate + "\u00A2";
    }
    
    /**
     * Doubles the hourly pay
     * @return doubled hourly pay
     */
    public double getDoublePay(){
        return hourlyPayRate * 2;
    }
    
    /**
     * Calculates pay for a 40 hour work week
     * 
     * @return The wages that the hourly work will collect
     */
    @Override
    public double collectPay(){
        return getHourlyPayRate() * 40;
    }
}
