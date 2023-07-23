
import java.util.Calendar;

/**
 * A Worker is:
 * 
 *  Worker w = new Worker()
 * 
 * INTERPRETATION: Base class representing different types of workers
 * @author jason
 */
public class Worker {
    
    private String name;
    private String birthDate;
    private String endDate;

    /**
     * Creates a (past) worker record.
     * @param name
     * @param birthDate
     * @param endDate 
     */
    public Worker(String name, String birthDate, String endDate) {
        
        if(name.isEmpty()){
            this.name = "Unknown Hire";
        } else {
            this.name = name;
        }
        
        this.birthDate = birthDate;
        this.endDate = endDate;
    }
    
    /**
     * New Worker
     * 
     * @param name
     * @param birthDate 
     */
    public Worker(String name, String birthDate){
        this(name, birthDate, "");
    }
    
    /**
     * Random worker
     */
    public Worker(){
        this("Unknown Hire", "1980/01/01");
    }
    
    /**
     * 
     * @return The current age of the employee
     */
    public int getAge(){
        
        Calendar c = Calendar.getInstance();
        return c.get(Calendar.YEAR) - 
                Integer.parseInt(birthDate.substring(0, 4));
    }
    
    public double collectPay(){
        
        return 0.0d;
    }
    
    /**
     * Sets the date the Worker was terminated
     * 
     * @param endDate 
     */
    public void terminate(String endDate){
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nDOB: " + birthDate + 
                ((!endDate.isEmpty()) ? "\nTerminated on: " + endDate : "");
    }
    
    
}
