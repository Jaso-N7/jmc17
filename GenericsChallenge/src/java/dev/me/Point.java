package dev.me;

public abstract class Point implements Mappable {

    protected double [] location;
    
    public void render () {
	System.out.format("Render %s as POINT (%s)",
			  this, java.util.Arrays.toString(location));
    }
}
