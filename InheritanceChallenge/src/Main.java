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
        System.out.println(s.getName() + " is " + s.getAge() + " years old");
        System.out.println(s.getName() + " collects " + s.collectPay());
        System.out.println(s.getName() + " is " + 
                ((s.isIsRetired()) ? " retired" : "still active in the field"));
        System.out.println();
        System.out.println(s);
        
        System.out.println();
    }
    
}
