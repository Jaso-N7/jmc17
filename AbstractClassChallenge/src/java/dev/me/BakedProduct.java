package dev.me;

public class BakedProduct extends ProductForSale {

    public BakedProduct (String type, double price, String description) {
	super(type, price, description);
    }

    @Override public void showDetails () {
	System.out.format("%s: %s",
			  type, description);
    }
}
