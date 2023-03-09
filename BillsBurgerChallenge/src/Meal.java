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

    final private Burger burger;
    final private Drink drink;
    final private Side side;
    final private double totalCost;

    public Meal () {
	this( new Burger(), new Drink(), new Side() );
    }

    public Meal (Burger burger, Drink drink, Side side) {
	this.burger = burger;
	this.drink = drink;
	this.side = side;
    }

    public double getTotalCost () {
	return burger.getPrice() +
	    drink.getPrice() +
	    side.getPrice();
    }

    @Override
    public String toString () {
	return "Meal Order: " + burger + ", " + drink + " & " + side;
    }
    
} // Meal
