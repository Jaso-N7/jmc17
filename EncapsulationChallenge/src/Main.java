/**
 *
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Setup a new non-duplex printer
        Printer printer = new Printer();
        System.out.format("%s%n", printer.toString());
        printer.addToner(100);
        System.out.println("Installed toner, current level " 
                + printer.getTonerLevel() + "%");
        printer.printPages(10);
        System.out.format("%s%n", printer.toString());
        System.out.println("Attempting to install more 50% more toner");
        System.out.println("addToner = " + printer.addToner(50));
        System.out.println("Printing 85 more pages");
        printer.printPages(85);
        System.out.format("%s%n", printer.toString());
        System.out.println("Printing another 85 more pages");
        printer.printPages(85);
        System.out.format("%s%n", printer.toString());
        

        
    }
    
}
