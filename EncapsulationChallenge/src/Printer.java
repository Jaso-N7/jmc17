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
    
    
    
}
