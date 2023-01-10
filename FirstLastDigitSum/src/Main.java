/**
 * Java Master Class (JDK 17) Coding Exercise 17: First and Last Digit Sum
 * 
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("First and Last Sum: ");
        
        int test = 252,
            expecting = 4,
            results = sumFirstAndLastDigit(test);
        System.out.print((results == expecting) ? "PASSED " : "FAILED ");
        System.out.println(test + " (expecting " + expecting + " ) => " + results);
        
        test = 257;
        expecting = 9;
        results = sumFirstAndLastDigit(test);
        System.out.print((results == expecting) ? "PASSED " : "FAILED ");
        System.out.println(test + " (expecting " + expecting + " ) => " + results);
        
        test = 0;
        expecting = 0;
        results = sumFirstAndLastDigit(test);
        System.out.print((results == expecting) ? "PASSED " : "FAILED ");
        System.out.println(test + " (expecting " + expecting + " ) => " + results);
        
        test = 5;
        expecting = 10;
        results = sumFirstAndLastDigit(test);
        System.out.print((results == expecting) ? "PASSED " : "FAILED ");
        System.out.println(test + " (expecting " + expecting + " ) => " + results);
        
        test = -10;
        expecting = -1;
        results = sumFirstAndLastDigit(test);
        System.out.print((results == expecting) ? "PASSED " : "FAILED ");
        System.out.println(test + " (expecting " + expecting + ") => " + results);
        
        
    }
    
    public static int sumFirstAndLastDigit(int number){
        if(number < 0) { return -1; }
        
        int sum = number % 10;
        int firstDigit = 0;
        int placeholder = number;
        
        while(placeholder != 0){
            
            firstDigit = placeholder % 10;
            placeholder /= 10;
            
        }
        
        return sum += firstDigit;
    } // sumFirstAndLastDigit :: Natural -> Natural
    
}
