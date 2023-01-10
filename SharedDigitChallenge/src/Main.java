
/**
 *
 * @author jason
 */
public class Main {

    /**
     * Confirms if any digit from the first number exists in the second number.
     * 
     * @param firstNumber
     * @param secondNumber
     * @return true if they share a digit; Otherwise false
     */
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        
        if(firstNumber < 10 || firstNumber > 99) { return false; }
        if(secondNumber < 10 || secondNumber > 99) { return false; }
        
        int first = firstNumber;
        int firstDigit = 0, secondDigit = 0;
        
        while(first != 0){
            
            firstDigit = first % 10;
            int second = secondNumber;
            
            while(second != 0){
                
                secondDigit = second % 10;
                
                if (firstDigit == secondDigit) {
                    return true;
                }
                
                second /= 10;
            }
            
            first /= 10;
        }
        
        return false;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testSuite(new int[]{
            12, 23,
            9, 99,
            15, 55,
            12, 13    
        },
                new boolean[]{
                    true,
                    false,
                    true,
                    true
                });

    }

    private static void testSuite(int[] numbers, boolean[] expecting) {

        boolean actual;
        
        int maxExpecting = expecting.length + 1;
        int maxNumbers = numbers.length;
        int aIndex = 0, eIndex = 0;
        
        do{
            actual = hasSharedDigit(numbers[aIndex], numbers[aIndex + 1]);
            
            System.out.print((actual == expecting[eIndex]) ? "PASSED " : "FAILED ");
            System.out.println(numbers[aIndex] + ", " + numbers[aIndex + 1] + 
                    " ( expecting " + expecting[eIndex] + " ) => " + actual); 
            
            aIndex += 2;
            eIndex++;
            if(aIndex >= maxNumbers){ break; }
            
        } while(eIndex < maxExpecting);
        
    }

}
