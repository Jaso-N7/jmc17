public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger (String meat, double price) {
	super("Healthy", meat, "Brown rye roll", price);
    }

    /**
     * Adds a healthy ingredient to the already healthy burger.
     *
     * @param name - Name of the ingredient
     * @param price - Cost of the ingredient
     */
    public void addHealthyAddition1 (String name, double price) {
	healythExtra1Name = name;
	healythExtra1Price = price;
    }

    /**
     * Adds a healthy ingredient to the already healthy burger.
     *
     * @param name - Name of the ingredient
     * @param price - Cost of the ingredient
     */
    public void addHealthyAddition2 (String name, double price) {
	healythExtra2Name = name;
	healythExtra2Price = price;
    }

    @Override
    public double itemizeHamburger () {
	return super.price + healythExtra1Price + healthyExtra2Price;
    }

}
