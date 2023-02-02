/**
 *
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        testPrinter(false);
        
        System.out.println();
        
        testPrinter(true);
        
    }
    
    /**
     * Setup and test the duplex printer
     */
    private static void testPrinter(boolean isDuplex) {
        
        Printer printer = new Printer(50, isDuplex);
        System.out.println(printer);
        
        System.out.println("initial page count = " + printer.getPagesPrinted());
        
        int print = 5;
        printer.printPages(print);
        System.out.format("Currently Printing: %d pages | Printer Total: %d%n",
                print, printer.getPagesPrinted());
        print = 10;
        printer.printPages(print);
        System.out.format("Currently Printing: %d pages | Printer Total: %d%n",
                print, printer.getPagesPrinted());
        
        System.out.println(printer);
    }
    
}
