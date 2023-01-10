/**
 *
 * @author jason
 */
public class Hello {
    
    public static void main(String[] args) {
        System.out.println("Hi, Jason!");
        
        boolean isAlienP = false;
        if (isAlienP == false){
            System.out.println("It is not an alien!");
            System.out.println("And I'm not afraid of aliens.");
        }
        
        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the high score!");
        }
        
        int secondBest = 95;
        if ((topScore > secondBest) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        
        if ((topScore > 90) || (secondBest <= 90)) {
            System.out.println("Either or both of the conditions are T");
        }
        
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is T.");
        }
        
        boolean isCarP = false;
        if (!isCarP) {
            System.out.println("This is not supposed to happen!!!");
        }
        
        // Condtional Operator - ternary
        String makeOfCar = "Volkswagen";
        boolean isDomesticP =  (makeOfCar == "Volkswagen") ? false : true; // not best practice in Production. See below for better alts.
        // !makeOfCar.equals("Volkswagen")
        // (makeOfCar != "Volkswagen");
        
        if (isDomesticP) {
            System.out.println("This car is domestic to our country");
        }
        
        String s = (isDomesticP) ? " is domestic" : " is not domestic";
        System.out.println(makeOfCar + s);
        
        // Challenge.
        // 1. Create a double variable with a value of 20.00
        double firstDouble = 20.00d,
        // 2. Create a second variable of type double with a value of 80.00
                secondDouble = 80.00d,
        // 3. Add both numbers together, then multiply by 100.00
                doubleTotal = (firstDouble + secondDouble) * 100.00d;
        // 4. Use modulo, to figure out what the remainder from the result of the operation in step 3, and 40.00, will be.
        double remainder = doubleTotal % 40.00d;
        // 5. Create a bool that asigns the value `true`, if the remainder in step 4 is 0.00, or `false` otherwise.
        boolean isRemainderZeroP = (remainder == 0);
        // 6. Output the boolean variable just to see what the result is.
        System.out.println("Is Remainder Zero? " + isRemainderZeroP);
        // 7. Write an if-then statement that displays a message, "Got some remainder", if the bool in step 5 is NIL.
        if (!isRemainderZeroP) {
            System.out.println("Got some remainder");
        }
    }
    
}
