import java.util.ArrayList;

/**
 * A Burger is a:
 * Burger b = new Burger();
 *
 * INTEPRETATION: 
 */
public class Burger {

    private final String type;
    private double price;
    protected ArrayList< String > extraToppings;

    public Burger (String type, double price) {
	this.type = type;
	this.price = price;
	this.extraToppings = new ArrayList<String>();
    }

    public Burger () {
	this( "Cheese" , 5.00d );
    }

    /**
     * Add (up to 3) extra toppings on the burger.
     */
    public void addTopping (String topping) {
	if (extraToppings.size() < 3) {

	    // This would be much better with enumerations
	    switch (topping.toLowerCase()) {
	    case "tomato" ->  price += 1.00d;  // $1 / slice
	    case "lettuce" -> price += 0.58d;  // $0.58c / leaf
	    case "cheese" ->  price += 0.95d;  // $0.95c / slice
	    default -> price += 0.50d; // any other toppings $0.50c
	    }
	    
	    extraToppings.add(topping);
	} else {
	    return;
	}
    }

    public String getType () { return type; }
    public double getPrice () { return price; }
    
    /**
     * Gets the extra toppings that were applied to the Burger
     *
     * @return The extra toppings as an ArrayList of Strings.
     * Expect up to three toppings.
     */
    public ArrayList< String > getToppings () {

	if (extraToppings == null) {
	    return new ArrayList<String>();
	}
	return extraToppings;
    }

    @Override
    public String toString () {
	StringBuilder sb = new StringBuilder(type + " Burger ");

	if (extraToppings != null) {
	    sb.append("With toppings: ");
	    for (String topping : getToppings()) {
		sb.append(topping + ", ");
	    }
	}
	
	sb.append(" priced at " + price);

	return sb.toString();
    }

}

