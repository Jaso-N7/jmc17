/**
 * A Meal is:
 *  Meal m = new Meal();
 * 
 * INTERPRETATION: A meal order that should be composed of exactly:
 * - Burger
 * - Drink
 * - Side
 */
public class Meal {

    private Burger burger;
    private Drink drink;
    private Side side;

    public Meal () {
	this( new Burger(), new Drink(), new Side() );
    }

    public Meal (Burger burger, Drink drink, Side side) {
	this.burger = burger;
	this.drink = drink;
	this.side = side;
    }

    @Override
    public String toString () {
	return "Meal Order: " + burger + ", " + drink + " & " + side;
    }
    
} // Meal
