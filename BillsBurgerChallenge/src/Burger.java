import java.util.ArrayList;

/**
 * A Burger is a:
 * Burger b = new Burger()
 */
public class Burger {

    private final String type;
    private double price = 3.75d;
    private ArrayList< String > extraToppings;

    public Burger (String type, ArrayList< String > extra) {
	this.type = type;
	extraToppings = extra;
    }

    public Burger () {
	this( "Cheese" , new ArrayList< String >() );
    }
}
