package dev.me;

public class CleaningProduct extends ProductForSale {

    public CleaningProduct (String type, double price, String description) {
	super(type, price, description);
    }

    @Override
    public void showDetails () {
	System.out.format("%s: %s", type, description);
    }
}
