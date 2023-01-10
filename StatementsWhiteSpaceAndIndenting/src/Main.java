
/**
 * @author jason
 * @date Jan 1, 2023 23:06 See StyleGuide Java Guide Section 4.6 Whitespace
 */
public class Main {

    public static void main(String[] args) {

        // Statement
        // Whitespace being ignored
        int myVariable
                = 50;

        // Both are complete statements
        myVariable++;
        myVariable--;

        System.out.println("This is a test"); // A ; is needed to complete a statement

        // A statement spread across multiple lines with white spaces
        System.out.println("This is"
                + " another"
                + " still more.");

        // this is still a valid statement, although unreadable
        // int anotherVariable=50;myVariable--; System.out.println("myVariable ="+myVariable );
        // below is formatted from the IDE.
        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable =" + myVariable);
        
        if (myVariable == 0) {
            System.out.println("It's now zero");
        }
    } // psvm

} // Main
