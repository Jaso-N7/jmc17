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
    }

    public Burger () {
	this( "Cheese" , 5.00d );
    }

    /**
     * Add (up to 3) extra toppings on the burger.
     */
    public void applyToppings (String topping) {
	if (extraToppings.size() < 3) {

	    // This would be much better with enumerations
	    switch (topping.toLowerCase()) {
	    case "tomato" ->  price += 1.00d;  // $1 / slice
	    case "lettuce" -> price += 0.58d;  // $0.58c / leaf
	    case "cheese" ->  price += 0.95d;  // $0.95c / slice
	    }
	    
	    extraToppings.add(topping);
	} else {
	    return;
	}
    }

    public String getBurgerType () { return type; }
    public double getBurgerPrice () { return price; }
    
    /**
     * Gets the extra toppings that were applied to the Burger
     *
     * @return The extra toppings as an ArrayList of Strings.
     * Expect up to three toppings.
     */
    public ArrayList< String > getToppings () {
	return extraToppings;
    }

}

