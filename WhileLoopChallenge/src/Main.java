/**
 * While Loop challenge from Lecture 65 Java Master Class
 *
 */
public class Main{

    public static void main(String[] args){

	int number = 5;
	int countEvenNumbers = 0,
	    countOddNumbers = 0;
	
	while (number <= 20){
	    if (isEvenNumber(number)){
		countEvenNumbers++;
		System.out.println(number);
	    } else {
		countOddNumbers++;
	    }

	    if(countEvenNumbers == 5) break;
	    
	    number++;
	}

	System.out.println("Found " + countOddNumbers +
			   " Odd numbers and, " + countEvenNumbers +
			   " Even numbers.");
	
    } // psvm

    /**
     * Determines if the number is an even number.
     *
     * @params number Number to check
     * @return Returns true if the number is even; Otherwise false;
     */
    private static boolean isEvenNumber(int number){
	return (number % 2 == 0);
    } // isEvenNumber :: Integer -> Boolean
}
