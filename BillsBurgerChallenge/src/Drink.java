public class Drink {

    final private String type;
    final private String flavour;
    private String size;
    private double basePrice = 3.50d;

    public Drink () {
	this( "Soda", "Coke", "Small" );
    }

    public Drink (String type, String flavour, String size) {
	this.type = type;
	this.flavour = flavour;
	this.size = size;
    }

    public String getType () { return "%s %s %s".formatted(size, flavour, type); }
    public String getFlavour () { return flavour; }
    public String getSize () { return size; }

    public double getPrice () {

	double pricing = drinkPrices( type );
	
	return switch ( size.toLowerCase() ) {
	case "small", "sml" -> { yield pricing + pricing * 0.25d; }
	case "medium", "med" -> { yield pricing + pricing * 0.5d; }
	case "large",  "lrg" -> { yield pricing + pricing * 0.75d; }
	default -> pricing;
	};
    }

    /**
     * Sets the size to one of the valid values passed:
     * "Small", "Medium" or "Large". If an invalid value is passed,
     * set it to the default of "Medium"
     */
    public void setSize (String size) {

	String newSize = size.toLowerCase();
	
	if ( newSize.equals("small") ||
	     newSize.equals("medium") ||
	     newSize.equals("large") ) {
	    this.size = size;
	} else { this.size = "Medium"; }
    }
    
    /**
     * Used for updating the drink prices. Should only be set by
     * management / admin
     */
    public void setPrice ( double price ) {
	basePrice = price;
    }
    
    private double drinkPrices ( String drinkType ) {

	return switch ( drinkType.toLowerCase() ) {
	    case "soda" -> basePrice;
	    case "juice" -> { yield basePrice * 1.2; }
	    default -> { yield basePrice * 0.9; } // water
	};
    }

    @Override
    public String toString () {
	return String.format("A %s %s %s, priced at $%.2f\u00A2",
			     size, flavour, type, getPrice());
    }

}
