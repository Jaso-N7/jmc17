/**
 * Inheritance Challenge
 * 
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SalariedEmployee s = new SalariedEmployee(187_000, false, 101, "Yochannan",
        "1976/05/18", "2019/05/01");
        s.retire();
        System.out.println(s.getName() + "(EID: " + s.getEmployeeId() + ") is " + s.getAge() + " years old");
        System.out.println(s.getName() + " collects \u0024" + s.collectPay() + "\u00A2 / month");
        System.out.println(s.getName() + " is " + 
                ((s.isIsRetired()) ? " retired on " + s.getEndDate() : "still active in the field"));
        System.out.println();
        System.out.println(s);
        
        System.out.println();
       
        HourlyEmployee h = new HourlyEmployee(45.00d, 102, "Shimeon ben Yaaqov",
                "1985/12/09", "2013/09/25");
        System.out.println(h.getName() + " (EID: " + h.getEmployeeId() + ") started working as of " + h.getHireDate());
        System.out.println("Being " + h.getAge() + " years old, he earns \u0024" +
                h.getHourlyPayRate() + "\u00A2/hr.");
        System.out.println("Due to his exception performance, he now earns $" +
                h.getDoublePay() + "/hr");
        System.out.println();
        
        System.out.println(h);
    }
    
}
