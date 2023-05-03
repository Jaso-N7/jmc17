package dev.me;

public abstract class Line implements Mappable {

    protected double points [][];

    public void render () {
	System.out.format("LINE (%s)",
			  java.util.Arrays.deepToString(points));
    }
}
