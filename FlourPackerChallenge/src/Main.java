/**
 * Coding exercise 25: Flour Pack Problem
 * @author jason
 */
public class Main {

    /**
     * Determines how possible it is to make a package (the goal) with the amount
     * of 5kg and 1kg entered. 
     * 
     * @param bigCount Represents the count of big flour bags (5 kilos each)
     * @param smallCount Represents the count of small flour bags (1 kilo each)
     * @param goal The amount of kilos of flour needed to assemble a package
     * @return true if it is possible to make a package with "goal" kilos of flour
     */
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        
        return false;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        testCanPack(
                new int[]{
                1, 0, 4,
                1, 0, 5,
                0, 5, 4,
                2, 2, 11,
                -3, 2, 12},
                new boolean[]{
                    false,
                    true,
                    true,
                    true,
                    false
                });
    }
    
    private static void testCanPack(int[] inputs, boolean[] outputs){
    
        boolean output;
        
        int maxAnswers = outputs.length + 1;
        int maxInputs = inputs.length;
        int in = 0, out = 0;
        
        do{
            int n1 = inputs[in], n2 = inputs[in + 1], n3 = inputs[in + 2];
            output = canPack(n1, n2, n3);
            
            System.out.print((output == outputs[out]) ? "PASSED " 
                    : "FAILED, expected: " + outputs[out] + "\n");
            System.out.println("canPack( " + n1 + ", " + n2 + ", " + n3 + 
                    " ) => " + output); 
            
            out++;
            in += 3;
            if(in >= maxInputs){ break; }
                        
        } while(out < maxAnswers);
    } // testCanPack
}
