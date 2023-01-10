/**
 * Using the for loop, attempt the 'Sum 3 and 5 Challenge' from Lecture 62.
 * 
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int sum = 0, counter = 0;
        
        for (int i = 10; i <= 1_000; i++) {
            if(i % 3  == 0 && i % 5 == 0){
                sum += i;
                System.out.println(i + " can be divided.");
            }
            
            if(++counter == 5) break;
        }
        
        System.out.println("Sum = " + sum);
    }
    
    /**
     * Helper function to generate a starting number
     * 
     * @return 
     */
    private static int starterNumber() {
        
        double randomNumber = Math.random();
        double rando = randomNumber > 0.5 ? randomNumber * 1_000 : randomNumber * 100;
        
        return (int) rando;
    } // starterNumber :: Integer
}
