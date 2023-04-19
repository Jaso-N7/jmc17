package dev.me;

public class CannedProduct extends ProductForSale {

    public CannedProduct (String type, double price, String description) {
	super(type, price, description);
    }

    @Override public void showDetails () {
	System.out.format("%s: %s", type, description);
    }
}
