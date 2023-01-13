/**
 * Coding exercise 26: Largest Prime
 * 
 * @author jason
 */
public class Main {

    public static int getLargestPrime(int number) {

        if (number < 2) { return -1; }
        
        if(number == 2 || number == 3){ return number; }
        
        int maxPrime = -1;
        if(number < 40){
        for (int i = 1; i <= number; i++) {
            if ((6 * i + 1) == number || (6 * i - 1) == number) {
                maxPrime = i;
            }
        }
        } else {
            for (int i = 0; i < number; i++) {
                maxPrime = i * i + i + 41;
            }
        }
        
        return maxPrime;
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testGetLargestPrime(
                new int[]{21, 217, 0, 45, -1}, 
                new int[]{7, 31, -1, 5, -1});
    }
    
    private static void testGetLargestPrime(int[] inputs, int[] outputs){
        
        int output;
        
        int maxAnswers = outputs.length + 1;
        int maxInputs = inputs.length;
        int n = 0;
        
        do{
            output = getLargestPrime(inputs[n]);
            
            System.out.print((output == outputs[n]) ? "PASSED " 
                    : "FAILED, expected: " + outputs[n] + "\n");
            System.out.println("getLargestPrime( " + inputs[n] + " ) => " + output); 
            
            n++;
            if(n >= maxInputs){ break; }
            
        } while(n < maxAnswers);
        
    }
}
