import javax.swing.*;
/**
 * Used for testing Bill's Burger Master Challenge
 */
public class Main {
    
    public static void main(String... args) {

	/* 1. Create a default meal. */
	Meal meal = new Meal();
	meal.applyTopping("Cheese");
	meal.applyTopping("Tomato");
	meal.applyTopping("Peppers");

	System.out.println("=== Meal:\n" + meal.printItems());
	JOptionPane.showMessageDialog(null, meal.printItems(), "Basic Meal", 0);
	
	meal.drinkSize("Medium");
	System.out.println("\n=== Meal+ :\n" + meal.printItems());
	JOptionPane.showMessageDialog(null, meal.printItems(), "Basic Meal+", 0);
	
	/* 2. Create a meal with a burger, and the drink and side item of your choice,
	 with up to 3 extra toppings
	*/
	System.out.println();
	Burger burger = new Burger("Cheese", 4.99d);
				
	Drink drink = new Drink("Juice", "Orange", "Medium");
	Side side = new Side("Salad");
	
	Meal combo = new Meal(burger, drink, side);
	combo.applyTopping("Cheese");
	combo.applyTopping("Tomato");

	System.out.println("=== Combo Meal:\n" + combo.printItems());
	JOptionPane.showMessageDialog(null, combo.printItems(), "Combo Meal", 0);
	
	combo.drinkSize("Large");
	combo.applyTopping("Lettuce");
	System.out.println("\n=== Combo Meal+ :\n " + combo.printItems());
	JOptionPane.showMessageDialog(null, combo.printItems(), "Combo Meal+", 0);	

	/* 3. Create a meal with a deluxe burger, where all items, drink, side item and toppings
	   up to 5 extra toppings, are included in the burger price.
	*/
	System.out.println();
	Burger deluxe = new DeluxeBurger(7.99d);
	
	Drink soda = new Drink("Soda", "Sprite", "Large");
	Side fries = new Side("Chilli");

	Meal deluxeCombo = new Meal(deluxe, soda, fries);
	deluxeCombo.applyTopping("Cheese");
	deluxeCombo.applyTopping("Tomato");
	deluxeCombo.applyTopping("Lettuce");
	deluxeCombo.applyTopping("Pickles");
	deluxeCombo.applyTopping("Onions");

	System.out.println("=== Deluxe Meal:\n" + deluxeCombo.printItems());
	JOptionPane.showMessageDialog(null, deluxeCombo.printItems(), "Deluxe Meal", 0);
		
	deluxeCombo.drinkSize("Small");

	System.out.println("\n=== Deluxe Meal+:\n" + deluxeCombo.printItems());
	JOptionPane.showMessageDialog(null, deluxeCombo.printItems(), "Deluxe Meal+", 0);
	
    }
}
