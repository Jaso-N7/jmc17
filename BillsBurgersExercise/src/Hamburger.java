public class Hamburger {
    final private String name;
    final private String meat;
    final private String breadRollType;
    private double price;

    // possible additions to the hamburger
    private String addition1Name, addition2Name, addition3Name, addition4Name;
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger (String name, String meat,
		      String breadRollType, double price) {
	this.name = name;
	this.meat = meat;
	this.breadRollType = breadRollType;
	this.price = price;
    }

    /**
     * Allows adding an ingredient to the hamburger
     *
     * @param item - the first ingredient to add
     * @param itemPrice - the cost of the first ingredient
     */
    public void addHamburgerAddition1(String item, double itemPrice) {
	addition1Name = item;
	addition1Price = itemPrice;
    }

    /**
     * Allows adding an ingredient to the meal
     *
     * @param item2 - the second ingredient to add
     * @param item2Price - the cost of the second ingredient
     */
    public void addHamburgerAddition(String item2, double item2Price) {
	addition2Name = item2;
	addition2Price = item2Price;
    }

    /**
     * Allows adding an ingredient to the meal
     *
     * @param item3 - the third ingredient to add
     * @param item3Price - the cost of the third ingredient
     */
    public void addHamburgerAddition(String item3, double item3Price) {

	addition3Name = item3;
	addition3Price = item3Price;
    }

    /**
     * Allows adding an ingredient to the meal
     *
     * @param item4 - the fourth ingredient to add
     * @param item4Price - the cost of the fourth ingredient
     */
    public void addHamburgerAddition4(String item4, double item4Price) {
	addition4Name = item4;
	addition4Price = item4Price;
    }

    public double itemizeHamburger () {
	return price + addition1Price +
	    addition2Price + addition3Price + addition4Price;
    }
    
}
