/**
 * Coding exercise 26: Largest Prime
 * 
 * @author jason
 */
public class Main {

    public static int getLargestPrime(int number) {
        return number;
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
