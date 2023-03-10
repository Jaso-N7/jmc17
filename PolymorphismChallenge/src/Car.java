/**
 *
 * @author jason
 */
public class Car {
    private String description;
    private String powerTrain;
    private double ccRating;
    protected double currentSpeed;

    public Car(String description, double ccRating, String powerTrain){
	this.description = description;
        this.ccRating = ccRating;
        this.powerTrain = powerTrain;
    }

    public String getDescription() {
	return description;
    }
    
    public String getPowerTrain () {
        return powerTrain;
    }
    
    public double getCC () {
        return ccRating;
    }
    public void startEngine () {
        System.out.println("Car engine started");
    }
    
    public double getCurrentSpeed () {
        return currentSpeed;
    }
    
    public void setCurrentSpeed (double speed) {
        this.currentSpeed = speed;
    }
    
    public void drive () {
        if (currentSpeed == 0.0d) {
            System.out.println("Car stopped, Neutral");
        } else if (currentSpeed < 0.0d) {
            System.out.println("Selecting reverse");
            runEngine();
            System.out.println("Moving");
        } else {
            System.out.println("Matching appropriate gear with speed");
            runEngine();
            System.out.println("Moving");
        }
	
    }
    
    protected void runEngine () {
        System.out.println("Gear engaged");
    }

    public String toString () {
	return description + ", Engine: " + ccRating + 
                "L, Transmission details: " + powerTrain;
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar (String description, double ccRating, String powerTrain,
            double mpg, int cylinders) {
        super(description, ccRating, powerTrain);
        this.avgKmPerLitre = mpg;
        this.cylinders = cylinders;
    }
    
    public double getKmPerLitre () {
        return avgKmPerLitre;
    }
    
    public int getCylinders () {
        return cylinders;
    }
    
    @Override
    public String toString () {
        return "Gas powered " + super.toString() + ", with an avg Km / Litre of " +
                avgKmPerLitre + " & " + cylinders + " cylinders.";
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;
    
    public ElectricCar (String description, String powerTrain, 
            double kmPerCharge, int batterySize) {
        super(description, 0.0d, powerTrain);
        this.avgKmPerCharge = kmPerCharge;
        this.batterySize = batterySize;
    }
    
    public double getKmPerCharge() {
        return avgKmPerCharge;
    }
    
    public int getBatterySize () {
        return batterySize;
    }
    
    @Override
    public void drive () {
        System.out.println("Electronically controlling transmission");
        System.out.println("Moving");
    }
    
    @Override
    public String toString () {
        return "Electric Vehicle " + super.toString() + ", with an avg Km / Charge of " +
                avgKmPerCharge + " & " + batterySize + " Ah.";
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;
    
    public HybridCar (String description, double ccRating, String powerTrain, 
            double kmPerLitre, int batterySize, int cylinders ) {
        super(description, ccRating, powerTrain);
        avgKmPerLitre = kmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void drive () {
        super.drive();
        if (currentSpeed < 50) {
            System.out.println("Electric mode engaged");
        } else {
            System.out.println("Electric mode disengaged");
        }
    }
    
    @Override
    public String toString() {
        return "Hybrid Car " + super.toString() + ", with an avg. Km / Litre of" +
                avgKmPerLitre + ", a " + batterySize + " Ah battery & " + cylinders + 
                " cylinders";
    }
        
}
