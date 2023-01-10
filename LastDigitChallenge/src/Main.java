/**
 * Java Master Class (JDK 17) coding exercise 20: Last Digit Checker
 * @author jason
 */
public class Main {

    /**
     * Determines if at least two of the numbers share the same rightmost digit;
     * 
     * @param firstNumber
     * @param secondNumber
     * @param thirdNumber
     * @return true if rightmost digits are identical; otherwise false
     */
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
    
        if (firstNumber < 10 || firstNumber > 1_000) { return false; }
        if (secondNumber < 10 || secondNumber > 1_000) { return false; }
        if (thirdNumber < 10 || thirdNumber > 1_000) { return false; }
        
        int firstDigit = firstNumber % 10,
            secondDigit = secondNumber % 10, 
            thirdDigit = thirdNumber % 10;
        
        if (firstDigit == secondDigit || firstDigit == thirdDigit) {
            return true;            
        } else if (secondDigit == thirdDigit) {
            return true;
        }
                
        return false;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testLastDigitChecker(new int[]{
            41, 22, 71,
            23, 32, 42,
            9, 99, 999
        },
                new boolean[]{
                    true,
                    true,
                    false
                });
    }
    
    /**
     * Test suite for hasSameLastDigit. The results will be printed to console.
     * 
     * @param numbers Each triplet index is one test case
     * @param expects Each index is the expected result of a test case
     */
    private static void testLastDigitChecker(int[] numbers, boolean[] expects){
        
        boolean actual;
        
        int maxExpecting = expects.length + 1;
        int maxNumbers = numbers.length;
        int n = 0, e = 0;
        
        do{
            actual = hasSameLastDigit(numbers[n], numbers[n + 1], numbers[n]);
            
            System.out.print((actual == expects[e]) ? "PASSED " : "FAILED ");
            System.out.println(numbers[n] + ", " + numbers[n + 1] + ", " + numbers[n + 2] +
                    " ( expecting " + expects[e] + " ) => " + actual); 
            
            n += 3;
            e++;
            if(n >= maxNumbers){ break; }
            
        } while(e < maxExpecting);
        
    } // testLastDigitChecker :: Numbers Results -> IO String
    
}
