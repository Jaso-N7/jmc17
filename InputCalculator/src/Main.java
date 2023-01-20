
import java.util.Scanner;

/*
 * Udemy Course Java Master Class (JDK 17)
 * Coding exercise 28: Input Calculator
 */

/**
 *
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    
    /**
     * Calculates the sum and average of numbers input by user
     */
    public static void inputThenPrintSumAndAverage(){
        
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0, inputCounter = 0;
        long average = 0L;
        String input;
        
        while(true){

           input = scanner.nextLine(); 
           ++inputCounter;
            
            try{
                
                sum += Integer.parseInt(input);
                average = Math.round(sum / inputCounter);
                
            } catch (NumberFormatException nfe){
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
        
    } // inputThenPrintSumAndAverage :: IO String
}
