/**
 * Coding Exercise 24: Numbers to Words.
 * 
 * Run the project to see the output.
 * 
 * @author jason
 */
public class Main {

    /**
     * Print out the given number using words for the digits
     * 
     * @param number 
     */
    public static void numberToWords(int number) {
        
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            
            int num = number;
            while(num != 0){
                
                switch(num % 10){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                
                num /= 10;
                                
            }
            
        }
                        
    } // numberToWord :: IO String
    
    /**
     * Return the count of the digits in the given number.
     * 
     * @param number
     * @return given: 5_200 , expect: 4
     */
    public static int getDigitCount(int number) {
        
        if (number < 0) {
            return -1;
        }
        
        int digitCount = 0;
        int num = number;
        do{
            
            ++digitCount;
            num /= 10;
            
        }while (num != 0);
        
        return digitCount;
    } // getDigitCount :: Number -> Number
    
    /**
     * Reverses a number
     * 
     * @param number Any whole number
     * @return Given: 1234, expect: 4321
     */
    public static int reverse(int number) {
        
        int rebmun = 0;
        int num = number;
        while(num != 0){
            rebmun *= 10;
            rebmun += num % 10;
            num /= 10;
        }
        
        return rebmun;
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
            
            System.out.print((output == outputs[n]) ? "PASSED " 
                    : "FAILED, expected: " + outputs[n] + "\n");
            System.out.println("getDigitCount( " + inputs[n] + " ) => " + output); 
            
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
            
            System.out.print((output == outputs[n]) ? "PASSED " : "FAILED, expected: " 
                    + outputs[n] + "\n");
            System.out.println("reverse( " + inputs[n] + " ) => " + output); 
            
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
