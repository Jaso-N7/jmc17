package dev.me;

public abstract class Line implements Mappable {

    protected double points [][];

    public void render () {
	System.out.format("Render %s as LINE (%s)",
			  this, java.util.Arrays.deepToString(points));
    }
}
