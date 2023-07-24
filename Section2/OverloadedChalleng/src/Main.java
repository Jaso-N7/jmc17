/**
 *
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("23\" converts to " +
                convertToCentimeters(23) +
                " cm");
        System.out.println("5' 9\" in converts to " +
                convertToCentimeters(5, 9) +
                " cm");
        
    } // end main :: [Strings] -> Void
    
    /**
     * Convert inches to centimeters
     * 
     * @param inches Represents the entire height in Inches
     * @return Centimeters
     */
    public static double convertToCentimeters(int inches) {
        
        return inches * 2.54d;
    } // end convertToCentimeters :: Inches -> Centimeters
    
    /**
     * Converts Feet and Inches to centimeters.
     * 
     * @param feet
     * @param inches
     * @return Centimeters
     */
    public static double convertToCentimeters(int feet, int inches) {
        
        return convertToCentimeters(feet * 12 + inches);
        
    } // end convertToCentimeters :: Feet Inches -> Centimeters
}
