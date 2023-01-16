
/**
 * Coding exercise 26: Largest Prime
 *
 * @author jason
 */
public class Main {

    /**
     * Calculate the largest prime factor of a given number.
     * 
     * Non-destructive method.
     * (Solution taken from geeksforgeeks.org)
     * 
     * @param number
     * @return The largest prime factor
     */
    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }
        
        // no need to waste processing power on this
        if (number == 2) {
            return number;
        }
        
        int n = number;
        while (n % 2 == 0) {
            n /= 2;
        }
        
        // 1 is not a prime number
        if(n == 1){
            return 2;
        }
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while(n % i == 0){
                n /= i;
            }
        }
        
        return n;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testGetLargestPrime(
                new int[]{21, 217, 0, 45, -1, 16},
                new int[]{7, 31, -1, 5, -1, 2});
    }

    private static void testGetLargestPrime(int[] inputs, int[] outputs) {

        int output;

        int maxAnswers = outputs.length + 1;
        int maxInputs = inputs.length;
        int n = 0;

        do {
            output = getLargestPrime(inputs[n]);

            System.out.print((output == outputs[n]) ? "PASSED "
                    : "FAILED, expected: " + outputs[n] + "\n");
            System.out.println("getLargestPrime( " + inputs[n] + " ) => " + output);

            n++;
            if (n >= maxInputs) {
                break;
            }

        } while (n < maxAnswers);

    }
}
