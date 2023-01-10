/**
 * @author jason
 * @date Jan 1, 2023 23:37
 * 
 * Challenge: Insert a code segment after the code we've just reviewed:
 * set the existing `score` to 10,000
 * set the existing `levelCompleted` to 8
 * set the existing `bonus` to 200
 * use the same `if` condition (gameOVer == true) you want to perform the same
 * calculation, and print out the value of the `finalScore`
 */
public class MainChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean gameOver = true;
        int score = 800,
            levelCompleted = 5,
            bonus = 100;
        
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your previous high score was: " + highScore);
        
        System.out.println("Your new high score is: " + 
                calculateScore(gameOver, 10_000, 8, 200));
        
        /* The disadvantage of this code is using more memory. As the variables
        were re-declared.
        */
//        // if then else Challenge
//        boolean newGameOver = true;
//        int newScore = 10_000,
//            newLevelCompleted = 8,
//            newBonus = 200;
//        
//        int newFinalScore = newScore;
//        
//        if (newGameOver) {
//            newFinalScore += (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + newFinalScore);
//            System.out.println("Game Over! Level:" + 
//                    newLevelCompleted + 
//                    " Bonus: " + newBonus);
//        }

/* While using the memory more efficiently below, by reusing the variables,
the disadvantage is that we have no record of the previous values.
Code duplication is another disadvantage due to copy and pasting.
*
        score = 10_000;
        levelCompleted = 8;
        bonus = 200;
        
        finalScore = score;
        
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
*/

    } // psvm
    
    /**
     * Calculates the high score once the game is over.
     * 
     * @param gameOver
     * @param score
     * @param levelCompleted
     * @param bonus 
     * @return An integer representing the final high score
     */
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
                
        int finalScore = score;
        
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1_000;
        }
        
        return finalScore;
    } // calculateScore
    
} // Main
