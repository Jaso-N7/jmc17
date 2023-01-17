/**
 *
 * @author jason
 */
public class Main {

    /**
     * Prints diagonals to generate a rectangular pattern composed of stars (*).
     * 
     * @param number 
     */
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        
        for (int rows = 0; rows < number; rows++) {
            for (int cols = 0; cols < number; cols++) {
                // In the first or last row
                if(rows == 0 || rows + 1 == number ||
                    // In the first or last column
                    cols == 0 || cols + 1 == number ||
                    // When the row number equals the column number
                    rows == cols ||
                    // When the column number equals rowCount - currentRow + 1
                    rows + cols == number - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } // printSquareStar :: Integer -> IO String
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Attempting a Star smaller than 5:");
        printSquareStar(3);
        System.out.println("Print Square Star of size 8:");
        printSquareStar(8);
    }
    
}
