/**
 * Digit Sum Challeng from Java Master Class lecture 66.
 *
 */
public class Main{

    public static void main(String[] args){

	System.out.println("The sum of -451 = " + sumDigits(-451));
	System.out.println("The sum of 125 = " + sumDigits(125));
	System.out.println("The sum of 1,000 = " + sumDigits(1_000));
	System.out.println("The sum of 1 = " + sumDigits(1));
	
    } // psvm

    /**
     * Given a Natural (positive number), parse out each digit from the number,
     * and sum the digits up.
     *
     * @params number The number that will be summed. given: 125, expect: 8
     * @return The sum off all digits in the number input
     *
     */
    public static int sumDigits(int number){
	if(number < 0) {
	    return -1;
	}

	int digitsSum = 0,
	    digits = number; // input value should remain unchanged.

	// improves efficiency, only runs if `number` is not a single digit
	while(digits > 9){
	    digitsSum += digits % 10; // extract the right most digit
	    digits /= 10; // drop the last digit as you are looping
	}

	digitsSum += digits;
	
	return digitsSum;
    }

} // Main
