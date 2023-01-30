/**
 *
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Refrigerator r = new Refrigerator(true);
        DishWasher d = new DishWasher(true);
        CoffeeMaker c = new CoffeeMaker(true);
        Oven o = new Oven(true);
        
        SmartKitchen kitchen = new SmartKitchen(o, d, r, c);
        
        kitchen.doKitchenWork();
    }
    
}
