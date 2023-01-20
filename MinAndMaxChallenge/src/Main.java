import java.util.Scanner;

/**
 * Min and Max Challenge using an endless loop
 * 
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        collectMinMax();
    }
    
    /**
     * Prompts the user for numbers and keeps track of the minimum and maximum
     * entered.
     * 
     * Minimum and maximum numbers will be continuously displayed.
     */
    public static void collectMinMax() {
        
        Scanner scanner = new Scanner(System.in);
        double min = 0, max = 0, in;
        String input;
        
        while(true){
        
            System.out.println("Enter a number, or any character to quit: ");
            input = scanner.nextLine();
            
            try{
                in = Double.parseDouble(input);
                
                if(min == 0 && max == 0){
                    min = max = in;
                }
                
                if (in <= min) {
                    min = in;
                } else if (in >= max) {
                    max = in;
                }
                
                System.out.println("Min = " + min);
                System.out.println("Max = " + max);
            } catch (NumberFormatException nfe){
                break;
            }
        }
        
    } // collectMinMax
        
} // Main
