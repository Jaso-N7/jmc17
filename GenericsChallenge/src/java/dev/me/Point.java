package dev.me;

public abstract class Point implements Mappable {

    protected double [] location;
    
    public void render () {
	System.out.format("POINT (%s)",
			  java.util.Arrays.toString(location));
    }
}
