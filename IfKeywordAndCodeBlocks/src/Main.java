/**
 * @author jason
 * @date Jan 1, 2023 23:37
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean gameOver = true;
        int score = 4_000,
            levelCompleted = 5,
            bonus = 100;
        
        if (score < 5_000 && score > 1_000) {
            System.out.println("Your score was "+ score);
        } else if (score < 1_000) {
            System.out.println("Your score was less that 1k");
        } else {
            System.out.println("Game over.");
        }
        
    } // psvm
    
} // Main
