/**
 *
 * @author jason
 */
public class Printer {
    
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    
    public int addToner(int tonerAmount){
        
        if ((tonerLevel + tonerAmount) > 100 
                || (tonerLevel + tonerAmount) < 0) {
            return -1;
        }
        
        return tonerLevel += tonerAmount;
    }
    
    public void printPages(int pages) {
        
        if (duplex) {
            pagesPrinted += pages / 2;
            System.out.println("This is a duplex printer");
            System.out.format("Printing %d pages%n", pagesPrinted);
        } else {
            pagesPrinted += pages;
            System.out.format("Printing %d pages%n", pagesPrinted);
        }
        
        // reduce toner level
        tonerLevel -= pagesPrinted;
    }

    public Printer(boolean duplex) {
        this.duplex = duplex;
        
        if(this.duplex){
            
        }
    }

    public Printer() {
        this(false);
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
