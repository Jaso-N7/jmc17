/**
 *
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SmartKitchen kitchen = new SmartKitchen();
        
        kitchen.addWater();
        kitchen.pourMilk();
        kitchen.loadDishWasher();
        
        kitchen.doKitchenWork();
    }
    
}
