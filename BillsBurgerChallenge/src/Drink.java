public class Drink {

    final private String type;
    final private String flavour;
    final private String size;
    private double basePrice = 5.00d;

    public Drink () {
	this( "Soda", "Coke", "Small" );
    }

    public Drink (String type, String flavour, String size) {
	this.type = type;
	this.flavour = flavour;
	this.size = size;
    }

    public String getType () { return type; }
    public String getFlavour () { return flavour; }
    public String getSize () { return size; }

    public double getPrice () {

	double pricing = drinkPrices( type );
	
	return switch ( size.toLowerCase() ) {
	case "small", "sml" -> { yield pricing * 1; }
	case "medium", "med" -> { yield pricing * 1.5; }
	case "large",  "lrg" -> { yield pricing * 2; }
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

	return swich ( drinkType.toLowerCase() ) {
	    case "soda" -> basePrice;
	    case "juice" -> { yield basePrice * 1.2; }
	    default -> { yield basePrice * 0.9; } // water
	};
    }

    @Override
    public String toString () {
	return "A " + size + " " + flavour + " " + type +
	    ", priced at $" + getPrice() + "\u00A2";
    }

}
