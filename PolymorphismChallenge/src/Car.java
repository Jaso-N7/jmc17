/**
 *
 * @author jason
 */
public class Car {
    private String description;
    
    public void startEngine () {
    }
    
    public void drive () {}
    
    protected void runEngine () {}
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