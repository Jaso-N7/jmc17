/**
 * Learning the Text Block and Formatting Options
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pre JDK 15 way of formatting strings
        String bulletIt = "Print a Bulletted List using String concat:\n" +
                "\t\u2022 This is how it is done using\n" +
                "\t\t\u2022 JDKs up to 14";
        
        System.out.println(bulletIt);
        
        String textBlock = """
                           Print a Bulleted List using Text Block:
                               \u2022 This is how it is done using
                                   \u2022 JDK 15 and up""";
        
        System.out.println(textBlock);
        
        int age = 42;
        System.out.format("%nYour age is %d%n", age);
        
        int yearOfBirth = 2023 - age;
        System.out.format("Age = %d, Birth year = %d%n", age, yearOfBirth);
        
        System.out.format("%nYour age is %.2f%n", (float) age);
        
        for (int i = 1; i <= 100_000; i *= 10) {
            System.out.format("Printing %6d %n", i);
        }
        
        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);
        
        formattedString = "Age = %d, Birth Year = %d"
                .formatted(age, yearOfBirth);
        System.out.println(formattedString);
    }
    
}
