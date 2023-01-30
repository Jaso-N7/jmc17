import java.util.Scanner;

/**
 * Learning how to read user's input
 * 
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int currentYear = 2023;
        
        try{
            
        System.out.println(getInputFromConsole(currentYear));
        
        } catch(NullPointerException npe){
            
            System.out.println(getInputFromScanner(currentYear));
            
        }
    }
    
    public static String getInputFromConsole(int currentYear) {
        
        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");
        
        String dob = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dob);
        
        return "So you are " + age + " years old.";
    }    
    
    public static String getInputFromScanner(int currentYear){
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hi, What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");
        
        System.out.println("What year were you born? ");
        
        boolean validDOB = false;
        int age = 0;
        
        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + currentYear);
            
            try{
            
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age > 0;
            } catch (NumberFormatException nfe) {
                System.out.println("Only numbers allowed!!!");
            }
            
        } while (!validDOB);
                
        return "So you are " + age + " years old.";
    }
    
    private static int checkData(int currentYear, String dateOfBirth) {
        
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125; // Assuming no one is older than this
        
        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }
        
        return currentYear - dob;
    }
    
}
