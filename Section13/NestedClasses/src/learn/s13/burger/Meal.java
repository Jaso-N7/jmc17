package learn.s13.burger;

import java.util.*;
import java.lang.Enum;

public class Meal {

    private double base = 5.0, conversionRate;
    private Burger burger;
    private Item drink, side;

    public Meal () {
	this(1);
    }
    
    public Meal (double conversionRate) {
	this.conversionRate = conversionRate;
	burger = new Burger();
	drink = new Item("coke", "drink", 1.5);
	System.out.println(drink.name);
	side = new Item("fries", "side", 2.0);
    }

    public double getTotal() {
	double total = burger.price() + drink.price + side.price;
	return Item.getPrice(total, conversionRate);
    }

    public void includeToppings (String... toppings) {
	burger.addTopping(toppings);
    }

    @Override
    public String toString () {
	return "%s%n%s%n%s%n%26s$%.2f"
	    .formatted(burger, drink, side,
		       "Total Due: ", getTotal());
    }
    
    private class Item {

	private String name, type;
	private double price;

	public Item (String name, String type) {
	    this(name, type, type.equals("burger") ? base : 0);
	}

	public Item (String name, String type, double price) {

	    this.name = name;
	    this.type = type;
	    this.price = price;
	}

	private static double getPrice(double price, double rate) {
	    return price * rate;
	}
	
	@Override public String toString() {
	    return "%10s%15s $%.2f".formatted(type, name,
					      getPrice(price, conversionRate));
	}
    }

    private class Burger extends Item {

	private List< Item > toppings = new LinkedList<>();

	// Enums are implicitly static when used within Inner Classes
	private enum Topping {
	    CHEESE, KETCHUP, LETTUCE,
	    PICKLES, ONIONS, TOMATO, PEPPERS;

	    /**
	     * Based on the topping selected, return its price
	     *
	     * @param {string} topping The chosen topping
	     * @return The price of the topping
	     */
	    public double pricing () {

		return switch(this) {
		case CHEESE -> 0.50;
		case KETCHUP -> 0.0;
		case LETTUCE -> 0.08;
		case PICKLES -> 0.07;
		case ONIONS -> 0.05;
		case TOMATO -> 0.45;
		case PEPPERS -> 0.35;
		default -> 0.0;
		};
	    }
	}

	public Burger () {
	    this("regular", 10.00);
	}
	
	public Burger (String name, double price) {
	    super(name, "burger", price);
	}

	public void addTopping (String... toppingsToAdd) {

	    for (String topping : toppingsToAdd) {

		try {
		    Topping selectedTopping = Topping.valueOf(topping.toUpperCase());
		    toppings.add(new Item(selectedTopping.name(),
					  "TOPPING",
					  selectedTopping.pricing()));
		} catch (IllegalArgumentException iae) {
		    System.out.println(topping + " isn't on the menu");
		}

	    }
	}

	public double price () {

	    double cost = super.price;

	    for (var topping : toppings) {
		cost += topping.price;
	    }
	    
	    return cost;
	}

	@Override
	public String toString () {

	    StringBuilder burgerString = new StringBuilder("Burger:\n");

	    for (Item ingredient : toppings) {
		burgerString.append(ingredient + "\n");
	    }

	    return burgerString.toString();
		
	}
    }
}
