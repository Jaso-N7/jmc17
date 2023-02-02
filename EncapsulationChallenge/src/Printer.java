/**
 *
 * @author jason
 */
public class Printer {
    
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    
    public int addToner(int tonerAmount){
        
        int newLevel = tonerLevel + tonerAmount;
        
        if (newLevel > 100 || newLevel < 0) {
            return -1;
        }
        
        return tonerLevel = newLevel;
    }
    
    /**
     * Keeps track of how many pages have been requested for printing.
     * NOTE: This function has the side-effect of reducing toner levels
     * 
     * @param pages 
     */
    public void printPages(int pages) {
        
        
        // purpose of using the modulo: when there is an odd number of pages, 
        // an extra sheet will be included.
        pagesPrinted += duplex ? pages / 2 + pages % 2 : pages;
                
        // reduce toner level - side-effect?
        tonerLevel -= pagesPrinted;
    }

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    /**
     * The string consists of information pertaining to the type of printer,
     * current toner level and the amount of pages printed.
     * 
     * The type of printer will either be a Duplex or not depending on the value
     * of this.duplex
     * @return 
     */
    @Override
    public String toString() {
        return String.format("%s with toner at %d%% and %d pages printed",
                duplex ? "Duplex printer" : "Printer",
                tonerLevel,
                pagesPrinted);
    }
       
}
