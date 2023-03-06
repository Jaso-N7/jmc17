public class Holden extends Car {

    public Holden (int cylinders, String name) {
	super(cylinders, name);
    }

    public void startEngine () {
	System.out.println("Holden -> startEngine()");
    }

    public void accelerate () {
	System.out.println("Holden -> accelerate()");
    }

    public void brake () {
	System.out.println("Holden -> brake()");
    }
} // Holden
