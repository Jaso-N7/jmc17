public class Ford extends Car {

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
