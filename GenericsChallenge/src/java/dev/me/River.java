package dev.me;

public class River extends Line {

    private String name;

    public River (String riverName, double [][] riverPoints) {
	name = riverName;
	points = riverPoints;
    }

    @Override public String toString () {
	return name + " River";
    }
}
