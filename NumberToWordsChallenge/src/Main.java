/**
 * Coding Exercise 24: Numbers to Words.
 * 
 * Run the project to see the output.
 * 
 * @author jason
 */
public class Main {

    /**
     * 
     * @param number 
     */
    public static void numberToWords(int number) {
        System.out.println("Not yet implemented");
    } // numberToWord :: IO String
    
    /**
     * 
     * @param number
     * @return 
     */
    public static int getDigitCount(int number) {
        return -1;
    } // getDigitCount :: Number -> Number
    
    /**
     * 
     * @param number
     * @return 
     */
    public static int reverse(int number) {
        return -1;
    } // reveres :: Number -> Number
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        testGetDigitCount(
                // each line represents a test,
                new int[]{
                    0,
                    123,
                    -12,
                    5200
                },
                // each line represents the expected outcome of the corresponding test.
                new int[]{
                    1,
                    3,
                    -1,
                    4                        
                });
        testReverse(
                new int[]{
                    -121,
                    1_212,
                    1_234,
                    100
                },
                new int[]{
                    -121,
                    2_121,
                    4_321,
                    1
                });
        runNumberToWords(
                new int[]{
                    123,
                    1_010,
                    1_000,
                    -12
                });
    }
    
    private static void testGetDigitCount(int[] inputs, int[] outputs){
    
        int output;
        
        int maxAnswers = outputs.length + 1;
        int maxInputs = inputs.length;
        int n = 0;
        
        do{
            output = getDigitCount(inputs[n]);
            
            System.out.print((output == outputs[n]) ? "PASSED " : "FAILED ");
            System.out.println(inputs[n] + " ( expecting " + outputs[n] + " ) => " 
                    + output); 
            
            n++;
            if(n >= maxInputs){ break; }
            
        } while(n < maxAnswers);
        
    } // testGetDigitCount :: IO String
    
    private static void testReverse(int[] inputs, int[] outputs){
    
        int output;
        
        int maxAnswers = outputs.length + 1;
        int maxInputs = inputs.length;
        int n = 0;
        
        do{
            output = reverse(inputs[n]);
            
            System.out.print((output == outputs[n]) ? "PASSED " : "FAILED ");
            System.out.println(inputs[n] + " ( expecting " + outputs[n] + " ) => " 
                    + output); 
            
            n++;
            if(n >= maxInputs){ break; }
            
        } while(n < maxAnswers);
        
    } // testReverse :: IO String
    
    private static void runNumberToWords(int[] inputs){
    
        for (int n = 0; n < inputs.length; n++) {
            System.out.print(inputs[n] + " => ");
            numberToWords(inputs[n]);
            System.out.println("");
        }

        
        
    } // runNumberToWords :: IO String
    
}
