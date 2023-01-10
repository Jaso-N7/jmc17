/**
 * Java Master Class (JDK 17) Coding exercise 18: Even Digit Sum
 * 
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int test = 123456789,
            expecting = 20,
            results = getEvenDigitSum(test);
        System.out.print((results == expecting) ? "PASSED " : "FAILED ");
        System.out.println(test + " (expecting " + expecting + " ) => " + results);
        
        test = 252;
        expecting = 4;
        results = getEvenDigitSum(test);
        System.out.print((results == expecting) ? "PASSED " : "FAILED ");
        System.out.println(test + " (expecting " + expecting + " ) => " + results);
        
        test = -22;
        expecting = -1;
        results = getEvenDigitSum(test);
        System.out.print((results == expecting) ? "PASSED " : "FAILED ");
        System.out.println(test + " (expecting " + expecting + " ) => " + results);
    }
    
    public static int getEvenDigitSum(int number){
        
        if(number < 0){ return -1; }
        
        int evenDigitSum = 0;
        int placeholder = number;
        int num = 0;
        
        while(placeholder != 0){
            num = placeholder % 10; // get the right most digit
            
            if(num % 2 == 0){
                evenDigitSum  += num;
            }
            
            placeholder /= 10;
        }
        
        return evenDigitSum;
    } // getEvenDigitSum :: Integer -> Integer
    
}
