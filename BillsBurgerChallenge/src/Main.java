import javax.swing.*;

public class Main {
    
    public static void main(String... args) {

	/* 1. Create a default meal. */
	Meal meal = new Meal();

	/* 2. Create a meal with a burger, and the drink and side item of your choice,
	 with up to 3 extra toppings
	*/
	Burger burger = new Burger("Cheese", 4.99d);
	burger.addTopping("Cheese");
	burger.addTopping("Tomato");
	burger.addTopping("Lettuce");
			
	Drink drink = new Drink("Juice", "Orange", "Medium");
	Side side = new Side("Salad");
	
	Meal combo = new Meal(burger, drink, side);

	/* 3. Create a meal with a deluxe burger, where all items, drink, side item and toppings
	   up to 5 extra toppings, are included in the burger price.
	*/
	DeluxeBurger deluxe = new DeluxeBurger();
	deluxe.addTopping("Cheese");
	deluxe.addTopping("Tomato");
	deluxe.addTopping("Lettuce");
	deluxe.addTopping("Pickles");
	deluxe.addTopping("Onions");

	Drink soda = new Drink("Soda", "Sprite", "Large");
	Side fries = new Side("Fries");

	Meal deluxeCombo = new Meal(deluxe, soda, fries);
	
    }
}
