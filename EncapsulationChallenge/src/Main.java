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
//        
        // Encapsulation Exercise testing
//        Printer printer = new Printer(true);
//        System.out.println(printer.addToner(50));
//        System.out.println("initial page count = " + 
//                printer.getPagesPrinted());
//        printer.printPages(4);
//        int pagesPrinted = printer.getPagesPrinted();
//        System.out.println("Printing 4 pages," + 
//                " new total print count for printer = " + 
//                printer.getPagesPrinted());
//        printer.printPages(2);
//        System.out.println("Printing 2 pages,"  + 
//                " new total print count for printer = " + 
//                printer.getPagesPrinted());
        
    }
    
    /**
     * Setup and test the duplex printer
     */
    private static void testPrinter(boolean isDuplex) {
        
        Printer printer = new Printer(isDuplex);
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
