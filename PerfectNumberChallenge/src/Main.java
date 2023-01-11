/**
 * Coding Exercise 23: Perfect Number
 * 
 * @author jason
 */
public class Main {

    /**
     * Calculates if the number is perfect.
     * 
     * @param number A positive integer (Natural)
     * @return `true` if the number is perfect; Otherwise, `false`
     */
    public static boolean isPerfectNumber(int number){
        
        return false;
    } // isPerfectNumber :: Natural -> Boolean
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testPerfectNumber(
                // Each line represents a test
                new int[]{
                    6,
                    28,
                    5,
                    -1
                },
                // Each line respents an output for the corresponding test.
                new boolean[]{
                    true,
                    true,
                    false,
                    false
                }
        );
    }
    
    private static void testPerfectNumber(int[] inputs, boolean[] answers){
    
        boolean answer;
        
        int maxAnswers = answers.length + 1;
        int maxInputs = inputs.length;
        int n = 0;
        
        do{
            answer = isPerfectNumber(inputs[n]);
            
            System.out.print((answer == answers[n]) ? "PASSED " : "FAILED ");
            System.out.println(inputs[n] + " ( expecting " + answers[n] + " ) => " 
                    + answer); 
            
            n++;
            if(n >= maxInputs){ break; }
            
        } while(n < maxAnswers);
        
    } // end test<FunctionName>
    
}
