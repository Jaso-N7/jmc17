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
     * Allows adding an ingredient to the meal
     *
     * @param item - the ingredient to add
     * @param itemPrice - the cost of the ingredient
     */
    public void addItem(String item, double itemPrice) {
	addition1Name = item;
	addition1Price = itemPrice;
    }

    /**
     * Allows adding an ingredient to the meal
     *
     * @param item1 - the first ingredient to add
     * @param item1Price - the cost of the first ingredient
     * @param item2 - the second ingredient to add
     * @param item2Price - the cost of the second ingredient
     */
    public void addItem(String item1, double item1Price,
			String item2, double item2Price) {
	addition1Name = item1;
	addition1Price = item1Price;
	addition2Name = item2;
	addition2Price = item2Price;
    }

    /**
     * Allows adding an ingredient to the meal
     *
     * @param item1 - the first ingredient to add
     * @param item1Price - the cost of the first ingredient
     * @param item2 - the second ingredient to add
     * @param item2Price - the cost of the second ingredient
     * @param item3 - the third ingredient to add
     * @param item3Price - the cost of the third ingredient
     */
    public void addItem(String item1, double item1Price,
			String item2, double item2Price,
			String item3, double item3Price) {
	addition1Name = item1;
	addition1Price = item1Price;
	addition2Name = item2;
	addition2Price = item2Price;
	addition3Name = item3;
	addition3Price = item3Price;
    }

    /**
     * Allows adding an ingredient to the meal
     *
     * @param item1 - the first ingredient to add
     * @param item1Price - the cost of the first ingredient
     * @param item2 - the second ingredient to add
     * @param item2Price - the cost of the second ingredient
     * @param item3 - the third ingredient to add
     * @param item3Price - the cost of the third ingredient
     * @param item4 - the fourth ingredient to add
     * @param item4Price - the cost of the fourth ingredient
     */
    public void addItem(String item1, double item1Price,
			String item2, double item2Price,
			String item3, double item3Price,
			String item4, double item4Price) {
	addition1Name = item1;
	addition1Price = item1Price;
	addition2Name = item2;
	addition2Price = item2Price;
	addition3Name = item3;
	addition3Price = item3Price;
	addition4Name = item4;
	addition4Price = item4Price;
    }
    
}
