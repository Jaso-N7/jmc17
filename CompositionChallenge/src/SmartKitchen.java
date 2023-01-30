/**
 *
 * @author jason
 */
public class SmartKitchen {
    
    private Oven oven;
    private DishWasher dishWasher;
    private Refrigerator fridge;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen(Oven oven, DishWasher dishWasher, Refrigerator fridge, CoffeeMaker coffeeMaker) {
        this.oven = oven;
        this.dishWasher = dishWasher;
        this.fridge = fridge;
        this.coffeeMaker = coffeeMaker;
    }
    
    public void addWater() {}
    
    public void pourMilk() {}
    
    public void loadDishWasher() {}
    
    public void doKitchenWork() {}
}
