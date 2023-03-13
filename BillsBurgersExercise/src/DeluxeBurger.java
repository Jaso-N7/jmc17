public class DeluxeBurger extends Hamburger {

    public DeluxeBurger () {
	super("Deluxe", "Beef & Eggs", "White roll", 14.54);
	addition1Name = "Chips";
	addition1Price = 2.75d;
	addition2Name = "Drink";
	addition2Price = 1.81d;
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
