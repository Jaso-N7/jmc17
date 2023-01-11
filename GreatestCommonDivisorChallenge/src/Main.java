/**
 * Coding Exercise 22: Greatest Common Divisor
 * 
 * @author jason
 */
public class Main {

    public static int getGreatestCommonDivisor(int first, int second){
        
        return -1;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        testGreatestCommonDivisor(
            // Each line is a test case and expected response
            new int[]{
                25, 15,
                12, 30,
                9, 18,
                81, 153
            },
            // Each line is the expected response
            new int[]{
                5,
                6,
                -1,
                9
            });
    }
    
    private static void testGreatestCommonDivisor(int[] numbers, int[] answers){
    
        int answer;
        
        int maxExpecting = answers.length + 1;
        int maxNumbers = numbers.length;
        int n = 0, e = 0;
        
        do{
            answer = getGreatestCommonDivisor(numbers[n], numbers[n + 1]);
            
            System.out.print((answer == answers[e]) ? "PASSED " : "FAILED ");
            System.out.println(numbers[n] + ", " + numbers[n + 1] +
                    " ( expecting " + answers[e] + " ) => " + answer); 
            
            n += 2;
            e++;
            if(n >= maxNumbers){ break; }
            
        } while(e < maxExpecting);
        
    }
    
}
