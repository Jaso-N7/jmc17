/**
 * Prime Number Challenge using `for` statements.
 * 
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int primeCounter = 0;
                
        for (int i = starterNumber(); i <= 1_000; i++) {
            
            if(isPrime(i)){
                
                System.out.println(i + " is a Prime Number");
                
                if(++primeCounter == 3){
                    break;
                }
            } // else { System.out.println(i + " is a Composite Number");}
        }
        
    } // psvm

    private static int starterNumber() {
        
        double randomNumber = Math.random();
        double rando = randomNumber > 0.5 ? randomNumber * 1_000 : randomNumber * 100;
        
        return (int) rando;
    } // starterNumber :: Integer
    
    public static boolean isPrime(int wholeNumber){
        
        if(wholeNumber <= 2){ return (wholeNumber == 2); }
        
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if(wholeNumber % divisor == 0) {
                return false;
            }
        }
        
        return true;
    } // isPrime :: Number -> Boolean
    
}
