/**
 * Challenge to test understanding of using the `for` statement or loop.
 * 
 * 
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (double rate = 7.5d; rate <= 10; rate += 0.25d) {
            
            if (rate > 8.5) {
                break;
            }
            System.out.println("\u0024100.00\u00A2 at " + rate + "\u0025 = " +
                    "\u0024" + calculateInterest(100, rate) + "\u00A2");
        }
    } // end psvm
    
    
    private static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    } // calculateInterest :: Dollars Interest -> Dollars
    
}
