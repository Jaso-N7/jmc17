package dev.me;

public class Park extends Point {

    private String name;
        
    public Park (String parkName, double [] parkCoords) {
	name = parkName;
	location = parkCoords;
    }
    
    @Override public String toString () {
	return name + " National Park";
    }
}
