package dev.me;

public class Park extends Point {

    private String name;
        
    public Park (String parkName, double [] parkCoords) {
	name = parkName;
	location = parkCoords;
    }

    /**
     * System IO in the format:
     * Render <parkName> as POINT (<parkCoords>)
     */
    @Override
    public void render () {
	
	System.out.format("Render %s as ", name);
	super.render();
    }
}
