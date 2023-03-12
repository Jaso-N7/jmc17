
/**
 * A Deluxe Burger is a:
 * DeluxeBurger db = new DeluxeBurger( Toppings );
 *
 * INTERPRETATION: Any deluxe burger meal that has a set price,
 *                 so that any additional toppings do not change
 *                 the price.
 * WHERE: The deluxe burger should have room for an additional two toppings
 */
public class DeluxeBurger extends Burger {

    public DeluxeBurger (double price) {
	super("Deluxe", price);
    }

    @Override
    public void addTopping (String topping) {
	if (extraToppings.size() < 5) {
	    extraToppings.add(topping);
	} else { return; }
    }

}
