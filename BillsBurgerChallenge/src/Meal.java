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
	return burger.getPrice() +
	    drink.getPrice() +
	    side.getPrice();
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
    public String getItems () {

	StringBuilder items = new StringBuilder("Bill's Burger Order :-\n");
	items.append("-".repeat(7));
	items.append(String.format("%s $%5.2f\u00A2 %n".repeat(3),
				   burger.getType(), burger.getPrice(),
				   drink.getType(), drink.getPrice(),
				   side.getType(), side.getPrice()));
	items.append("Toppings:\n");

	for (String topping : burger.getToppings()){
	    items.append(String.format("%s %n",
				       topping));
				       
	}

	items.append(String.format("Total Cost: $%.2f\u00A2", getTotalCost()));
	return items.toString();
	    
    }

    @Override
    public String toString () {
	return "Meal Order: " + burger + ", " + drink + " & " + side;
    }
    
} // Meal
