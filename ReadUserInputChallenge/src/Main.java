
import java.util.Scanner;

/**
 * Reading User Input Challenge
 *
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sumOfNumbers());
    } // psvm

    /**
     * Read 5 valid numbers from the console, entered by the user, and print the
     * sum of those five numbers.
     *
     * @return
     */
    public static String sumOfNumbers() {

        int sum = 0,
                counter = 1;
        Scanner scanner = new Scanner(System.in);

        do {
            
            System.out.println("Enter number #" + counter + ":");
            try {
                
                sum += Integer.parseInt(scanner.nextLine());
                counter++;
                
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        } while (counter <= 5);

        return "Total = " + sum;
    } // sumOfNumbers :: IO String
}
