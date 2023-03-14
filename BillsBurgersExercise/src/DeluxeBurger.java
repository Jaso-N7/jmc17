public class DeluxeBurger extends Hamburger {

    public DeluxeBurger () {
	super("Deluxe", "Beef & Eggs", 14.54, "White roll");
	super.addHamburgerAddition1("Chips", 2.75d);
	super.addHamburgerAddition2("Drink", 1.81d);
    }

    @Override
    public void addHamburgerAddition1(String item, double itemPrice) {
	System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String item, double itemPrice) {
	System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String item, double itemPrice) {
	System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String item, double itemPrice) {
	System.out.println("Cannot add additional items to a deluxe burger");
    }
}
