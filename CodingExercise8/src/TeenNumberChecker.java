/**
 * Coding Exercise 8: Teen Number Checker
 * 
 * @author jason
 */
public class TeenNumberChecker {
    
    public static void main(String[] args) {
        System.out.println("hasTeen(9, 99, 19) => " + hasTeen(9, 99, 19));
        System.out.println("hasTeen(23, 15, 42) => " + hasTeen(23, 15, 42));
        System.out.println("hasTeen(22, 23, 34) => " + hasTeen(22, 23, 34));
    } // end main
    
    /**
     * Confirms if any of the inputs are within the range of 13 to 19 (inclusive)
     * 
     * @param a  
     * @param b 
     * @param c
     * @return `true` if any are within the range; Otherwise `false`.
     */
    public static boolean hasTeen(int a, int b, int c) {
        return withinRange(a) || withinRange(b) || withinRange(c);
    } // end hasTeen
 
    /**
     * Helper function to `hasTeen`.
     * @param number
     * @return True if 
     */
    public static boolean withinRange(int number){
        return ((number >= 13) && (number <= 19));
    } // end withinRange
}
