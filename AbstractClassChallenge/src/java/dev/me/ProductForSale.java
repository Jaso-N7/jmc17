/*
 * A ProducetForSale is a class:
 *
 *  ProductForSale pfs =
 *    new ProductForSale(Type, Price, Description)
 *
 * INTERPRETATION: Is a base class that can
 *
 * - get a sales price, which takes a **quantity** and **returns the
 *   quantity times the price**.
 * - print a Priced Line item, which takes a **quantity** and should
 *   **print an itemized line item**
 *  *
 * WHERE:
 * - Type is String of the kind of product
 * - Price is double referring to the cost of the product
 * - Description is a String of the product details
 * - showDetails() is abstract and represent what might be displayed
 *   on a product page, product type, description, price and so on.
 */

package dev.me;

public abstract class ProductForSale {

    protected String type;
    private double price;
    protected String description;

    public ProductForSale (String type, double price, String description) {
	this.type = type;
	this.price = price;
	this.description = description;
    }

    /**
     * Calculates the sales price based on the quantity.
     *
     * @param quantity - The amount of items
     * @return Sales price
     */
    public double getSalesPrice(double quantity) {
	
	return price * quantity;
    } // getSalesPrice :: Quantity -> Price

    /**
     * Prints an itemized line item for an order, with quantity and line
     * item price.
     * print a Priced Line item, which takes a **quantity** and should
     *  **print an itemized line item**
     *
     * @param quantity - The amount of items 
     */
    public String printLineItem(double quantity) {
	
	return String.format("%s - $%.2f\n%s\n",
			     type, getSalesPrice(quantity),
			     // short summary of the item
			     description.substring(0, 11));
	
    } // printLineItem :: Quantity -> String

    public abstract void showDetails ();
}
