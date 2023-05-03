package dev.me;

public class River extends Line {

    private String name;

    public River (String riverName, double [][] riverPoints) {
	name = riverName;
	points = riverPoints;
    }

    /**
     * System IO in the format:
     * Render <riverName> as LINE (<riverPoints>)
     */
    @Override
    public void render () {
	System.out.format("Render %s as",
			  name);
	super.render();
    }
}
