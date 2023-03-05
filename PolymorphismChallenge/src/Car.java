/**
 *
 * @author jason
 */
public class Car {
    private String description;

    public Car(String description){
	this.description = description;
    }

    public String getDescription() {
	return description;
    }
    
    public void startEngine () {
    }
    
    public void drive () {
	runEngine();
    }
    
    protected void runEngine () {}

    public String toString () {
	return description;
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;
}
