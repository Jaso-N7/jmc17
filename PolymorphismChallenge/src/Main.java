import java.util.*;

/**
 *
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

	ArrayList<Car> cars = new ArrayList();
	/*
	Car gas = new GasPoweredCar();
	Car ev = new ElectricCar();
	Car hybrid = new HybridCar();
	*/
	cars.add(new GasPoweredCar("2023 Mustang Mach 1 Premium", 5.0d, 
                "TREMEC 6-Speed Manual Transmission (with Rev Matching)", 19.9, 8));
        cars.add(new ElectricCar("2023 Solterra", "StarDrive all-electric drivetrain", 93.0d, 205));
        cars.add(new HybridCar("2023 Toyota Corolla Hybrid SE", 1.8d, "ECVT AWD", 
            44.0d, 105, 4));

        double[] speed = {0.0, 10.5, 61.5, 0, -9.8, 0.0};
        
	for (Car car : cars){
	    //System.out.println(car);
            System.out.println("\n===");
            System.out.println(car.getDescription());
            car.startEngine();
            
            for (int i = 0; i < speed.length; i++) {
                System.out.println("---");
                System.out.println("Speedometer: " + speed[i]);
                car.setCurrentSpeed(speed[i]);
                car.drive();
            }
            
	}
    }
    
}
