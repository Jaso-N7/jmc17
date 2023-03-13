/**
 * A Meal is:
 *  Meal m = new Meal() OR
 *  Meal m = new Meal(Burger, Drink, Side)
 * 
 * INTERPRETATION: A meal order that should be composed of exactly:
 *
 */
public class Meal {

    final private Burger burger;
    final private Drink drink;
    final private Side side;
    //    final private double totalCost;

    public Meal () {
	this( new Burger(), new Drink(), new Side() );
    }

    public Meal (Burger burger, Drink drink, Side side) {
	this.burger = burger;
	this.drink = drink;
	this.side = side;
    }

    public double getTotalCost () {
	if (burger instanceof DeluxeBurger deluxe) {
	    return deluxe.getPrice();
	} else {
	    return burger.getPrice() +
		drink.getPrice() +
		side.getPrice();
	}
    }

    /**
     * Add some additional toppings to the burger
     */
    public void applyTopping( String topping ) {
	burger.addTopping( topping );
    }

    /**
     * Change the size of the drink to either:
     * "Small", "Medium", or "Large"
     */
    public void drinkSize ( String size ) {
	drink.setSize( size );
    }

    /**
     * Print the itemized list, such as the price of the burger, any extra toppings,
     * the drink price  based on size and the side item price.
     */
    public String printItems () {

	StringBuilder items = new StringBuilder("Bill's Burger Order :-\n");
	items.append("=".repeat(25));

	if (burger instanceof DeluxeBurger) {
	    items.append("%n%10s%5.2f"
			 .formatted(burger.getType(), burger.getPrice()))
		.append("%n%10s0.00".repeat(2)
			 .formatted(drink.getType(), side.getType()));
	} else {
	
	items.append("%n%10s%5.2f".repeat(3)
		     .formatted(burger.getType(), burger.getPrice(),
				drink.getType(), drink.getPrice(),
				side.getType(), side.getPrice()));
	
	}
	items.append("\nToppings:\n");

	for (String topping : burger.getToppings()){
	    items.append(topping.indent(4));
	}
	
	items.append("-".repeat(50))
	    .append(String.format("%nTotal Cost: %5.2f", getTotalCost()));
	return items.toString();
	    
    }

    @Override
    public String toString () {
	return "Meal Order: " + burger + ", " + drink + " & " + side;
    }
    
} // Meal
