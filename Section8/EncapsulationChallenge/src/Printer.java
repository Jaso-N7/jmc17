/**
 *
 * @author jason
 */
public class Printer {
    
    private int tonerLevel;    // percentage of how much toner level is left
    private int pagesPrinted;  // count of total pages printed by the Printer
    private boolean duplex;    // if T, it can print on 2 sides of a single sheet.

    public Printer(boolean duplex) {
        this.tonerLevel = 100; // may not be necessary here
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }
    
    public int getPagesPrinted() {
        return pagesPrinted;
    }
    
    /**
     * Updates the Printer's toner level. 
     * Side-Effect: toner level will be updated.
     * 
     * @param tonerAmount An amount that will increase the toner's percentage level up to 100%
     * @return The toner level if it's value is within the range of 0 - 100;
     * Otherwise -1, if tonerAmount causes the level to fall outside the range.
     */
    public int addToner ( int tonerAmount ) { // should this accept an short type instead?
        
        int tempLevel = tonerLevel + tonerAmount;
        if ( tempLevel > 100 || tempLevel < 0) {
            return -1;
        }
        
        return tonerLevel += tonerAmount;
    }
    
    /**
     * Print the specified amount of pages, depending on if the printer is a 
     * duplex or not.
     * Side-Effect: pages printed & toner level will be updated.
     * 
     * @param pages The amount of pages to be printed
     */
    public void printPages ( int pages ) {
        
        if (duplex) {
            System.out.println("Duplex printer!");
            pagesPrinted += (pages / 2) + (pages % 2);
        } else {
            pagesPrinted += pages;
        }
        
        tonerLevel -= tonerLevel / (pagesPrinted + 1);
    }

    @Override
    public String toString() {
        return "Printer{" + "tonerLevel=" + tonerLevel + 
                ", pagesPrinted=" + pagesPrinted + 
                ", duplex=" + duplex + '}';
    }    

}
