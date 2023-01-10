/**
 * Java Master Class (JDK 17) Coding Exercise 21: All Factors
 * @author jason
 */
public class Main {

    /**
     * Print all factors of the number. A factor of a number is an integer which
     * divides by that number wholly (i.e. without leaving a remainder)
     * 
     * @param number
     */
    public static void printFactors(int number){
        
        if(number < 1) {
            System.out.println("Invalid Value");
        }
                
        for (int m = 1; m <= number; m++) {
            
            if (number % m == 0) {
                System.out.println(m);
            }
            
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testPrintFactors(new int[]{
            6, 32, 10, -1
        });
    }
    
    private static void testPrintFactors(int[] numbers){
        
                
        for (int n = 0; n < numbers.length; n++) {
            
            printFactors(numbers[n]); 
            // System.out.print(answers[n].equals(answer) ? "PASS " : "FAIL ");
            // System.out.println(numbers[n] + " => " + answer);
            
        }
        
    }
    
}
