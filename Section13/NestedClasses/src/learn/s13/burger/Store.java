package learn.s13.burger;

public class Store {

    public static void main (String [] args) {

	Meal regularMeal = new Meal();
	System.out.println(regularMeal);

	// At current 1 AUD = 103.72 JMD
	Meal JMRegularMeal = new Meal(103.718);
	System.out.println(JMRegularMeal);

	// Regular Burger with toppings
	Meal burgerCombo = new Meal();
	burgerCombo.includeToppings("KETCHUP", "ONIONS", "TOMATO", "PICKLES", "PEPPERS");
	System.out.println(burgerCombo);

	// testing the exception
	Meal hamBurger = new Meal();
	burgerCombo.includeToppings("ONIONS", "TOMATO", "PICKLES", "PEPPERS", "BACON");
	System.out.println(hamBurger);
    }

}
