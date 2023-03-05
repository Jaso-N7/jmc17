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
	cars.add(new GasPoweredCar())
	    .add(new ElectricCar())
	    .add(new HybridCar());

	for (Cars car : cars){
	    System.out.println(car);
	}
    }
    
}
