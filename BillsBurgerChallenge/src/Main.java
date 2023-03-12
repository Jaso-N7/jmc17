import javax.swing.*;

public class Main {
    
    public static void main(String... args) {

	/* 1. Create a default meal. */
	Meal meal = new Meal();
	meal.applyTopping("Cheese");
	meal.applyTopping("Tomato");
	meal.applyTopping("Peppers");
	meal.drinkSize("Medium");

	JOptionPane.showMessageDialog(null, meal, "Default Meal", 0);
	
	/* 2. Create a meal with a burger, and the drink and side item of your choice,
	 with up to 3 extra toppings
	*/
	Burger burger = new Burger("Cheese", 4.99d);
				
	Drink drink = new Drink("Juice", "Orange", "Medium");
	Side side = new Side("Salad");
	
	Meal combo = new Meal(burger, drink, side);
	combo.applyTopping("Cheese");
	combo.applyTopping("Tomato");
	combo.applyTopping("Lettuce");

	JOptionPane.showMessageDialog(null, combo, "Combo Meal", 0);
	combo.drinkSize("Large");
	JOptionPane.showMessageDialog(null, combo, "Combo Meal Go Large", 0);

	/* 3. Create a meal with a deluxe burger, where all items, drink, side item and toppings
	   up to 5 extra toppings, are included in the burger price.
	*/
	Burger deluxe = new DeluxeBurger(7.99d);
	
	Drink soda = new Drink("Soda", "Sprite", "Large");
	Side fries = new Side("Fries");

	Meal deluxeCombo = new Meal(deluxe, soda, fries);
	deluxeCombo.applyTopping("Cheese");
	deluxeCombo.applyTopping("Tomato");
	deluxeCombo.applyTopping("Lettuce");
	deluxeCombo.applyTopping("Pickles");
	deluxeCombo.applyTopping("Onions");
	
	JOptionPane.showMessageDialog(null, deluxeCombo, "Deluxe Meal", 0);
	
	deluxeCombo.drinkSize("Large");
	
	JOptionPane.showMessageDialog(null, deluxeCombo, "Deluxe Meal +", 0);
	
    }
}
