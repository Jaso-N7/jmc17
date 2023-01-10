/**
 * Challenges to ensure understanding of the `switch` statements.
 * Completed on Jan 5, 2023
 * 
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char natoAlpha = 'A';
        System.out.println(natoPhoneticAlphabet(natoAlpha));
        System.out.println(natoPhoneticAlphabet('B'));
        System.out.println(natoPhoneticAlphabet('C'));
        System.out.println(natoPhoneticAlphabet('D'));
        System.out.println(natoPhoneticAlphabet('E'));
        
        natoAlpha = 'F';
        System.out.println(natoPhoneticAlphabet(natoAlpha));
        
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
        
    }
    
    private static String natoPhoneticAlphabet(char abbrev){
        
        switch(abbrev){
            case 'A':
                return abbrev + " = Able";
            case 'B':
                return abbrev + " = Baker";
            case 'C':
                return abbrev + " = Charlie";
            case 'D':
                return abbrev + " = Dog";
            case 'E':
                return abbrev + " = Easy";
        }
        
        return abbrev + " not found!";
    }
    
    private static void printDayOfWeek(int day){
        
        String yom = switch(day){
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday (Preparation Day)";
            case 6 -> "Friday (Erev Shabbat)";
            case 7 -> "Shabbat";
            default -> "An invalid day!";
        };
        
        System.out.println("Yom " + day + " is " + yom);
    }
    
}
