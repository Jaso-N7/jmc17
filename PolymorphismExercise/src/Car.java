public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car (int cylinders, String name) {
	this.cylinders = cylinders;
	this.name = name;
    }

    public void startEngine () {
	System.out.println("Car -> startEngine()");
    }

    public void accelerate () {
	System.out.println("Car -> accelerate()");
    }

    public void brake () {
	System.out.println("Car -> brake()");
    }

    public int getCylinders () {
	return cylinders;
    }

    public String getName () {
	return name;
    }
} // Car

class Mitsubishi extends Car {

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

class Holden extends Car {

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

class Ford extends Car {

    public Ford (int cylinders, String name) {
	super(cylinders, name);
    }

    public void startEngine () {
	System.out.println("Ford -> startEngine()");
    }

    public void accelerate () {
	System.out.println("Ford -> accelerate()");
    }

    public void brake () {
	System.out.println("Ford -> brake()");
    }
} // Ford
