public class Main {
    public static void main(String[] args) {
        /* 
        | Statement ----------------  |
               | Expression --------|-|
        *           | Expression ---|-| */
        double km = (100d * 1.609344d);
        
        // 
        int highScore = 50;
        
        if (highScore > 25) {
            highScore = 1_000 + highScore; // add bonus points
        }
        
        // Challenge: How many expressions are below?
        // Init ans: 6
        // Correct ans: 6 Congrats I got them all!
        int health = 100;
        if ((health < 25) && (highScore > 1_000)) {
            highScore = highScore - 1_000;
        }
    }
}
