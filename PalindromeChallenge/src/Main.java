
/**
 * Number Palindrome challenge
 *
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-1221? " + isPalindrome(-1221));
        System.out.println("707? " + isPalindrome(707));
        System.out.println("11212? " + isPalindrome(11212));
        System.out.println("222? " + isPalindrome(222));
        System.out.println("? " + isPalindrome(10));
        System.out.println("8? " + isPalindrome(8));
        System.out.println("-8? " + isPalindrome(-8));

    }

    /**
     * Given an integer, confirm whether the number is a palindrome
     *
     * @param number
     * @return Returns `true` if the @param number is a palindrome; Otherwise
     * `false`
     */
    public static boolean isPalindrome(int number) {

        if ((number / 10) == 0) {
            return true;
        }

        int reverse = 0,
                lastDigit = 0,
                num = number;

        // reverse the number
        do {

            lastDigit = num % 10; // stores the last digit
            reverse *= 10; // Increase the place value of reverse by 1
            reverse += lastDigit; // Add last digit to reverse.
            num /= 10; // Remove the last digit from num

        } while (num != 0);

        return reverse == number;
    } // isPalindrome :: Int -> Boolean

}
