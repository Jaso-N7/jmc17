public class Mitsubishi extends Car {

    public Mitsubishi (int cylinders, String name) {
	super(cylinders, name);
    }

    public void startEngine () {
	System.out.println("Mitsubishi -> startEngine()");
    }

    public void accelerate () {
	System.out.println("Mitsubishi -> accelerate()");
    }

    public void brake () {
	System.out.println("Mitsubishi -> brake()");
    }
} // Mitsubishi
