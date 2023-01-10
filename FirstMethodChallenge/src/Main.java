/**
 * Method Challenge from Java Programming Masterclass (JDK 17) video 48 as at
 * Jan 2, 2023 11:51.
 * 
 * @author jason 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String playerOne = "Jason",
                playerTwo = "ZeroCool",
                playerThree = "Oneil",
                playerFour = "Patrick";
        
        int playerOneScore = 1_500,
                playerTwoScore = 1_000,
                playerThreeScore = 500,
                playerFourScore = 100;
        
        // Display result for the score 1500
        displayHighScorePosition(playerOne, 
                calculateHighScorePosition (playerOneScore));
        
        // Display result for the score 1000
        int playerTwoResult = calculateHighScorePosition(playerTwoScore);
        displayHighScorePosition(playerTwo, playerTwoResult);
        
        // Display result for the score 500
        int player3Posn = calculateHighScorePosition(playerThreeScore);
        displayHighScorePosition(playerThree, player3Posn);
        
        // Display result for the score 100
        displayHighScorePosition(playerFour,
                calculateHighScorePosition(playerFourScore));
        
        // Display result for the score 25
        displayHighScorePosition("Cookie Monster",
                calculateHighScorePosition(25));
        
    } // psvm
    
    /**
     * Output to screen, the given player position on the high score list.
     *  
     * @param playerName (String) Players name
     * @param playerPosn (Integer) Current position on the high score list
     */
    public static void displayHighScorePosition(String playerName, int playerPosn) {
        System.out.println(playerName + " managed to get into position " +
                playerPosn + " on the high score list.");
    }
    
    /**
     * Determines the players position based on their score.
     * 
     * @param playerScore (Integer) The players final score.
     * 
     * @return An integer representing positional result, between 1 to 4.
     * given: 1000 , expect: 1
     */
    public static int calculateHighScorePosition(int playerScore) {
        
        int posn = 4;
        
        if (playerScore >= 1_000) {
            posn = 1;
        } else if (playerScore >= 500) {
            posn = 2;
        } else if (playerScore >= 100) {
            posn = 3;
        }
            
        return posn;        
    }
    
} // Main
