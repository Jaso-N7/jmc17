public class Side {
    private String type;
    private double price = 2.00d;

    public Side () {
	this( "Fries ");
    }

    public Side (String type) {
	this.type = type;
    }

    public String getType () { return type; }
    
    public double getPrice () {
	return switch ( type.toLowerCase() ) {
	case "salad" -> { yield 4.35 * price; }
	case "potato" -> { yield 3.42 * price; }
	case "chili" -> { yield 2.53 * price; }
	default -> price;
	};
    }

    /**
     * Update the pricing on all sides. Only to be set by management / admin
     */
    public void setPrice ( double price ) {
	this.price = price;
    }

    @Override
    public String toString () {
	return "A " + type + " priced at $" + getPrice() + "\u00A2";
    }
}
