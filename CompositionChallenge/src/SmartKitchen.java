/**
 *
 * @author jason
 */
public class SmartKitchen {
    
    private Oven oven;
    private DishWasher dishWasher;
    private Refrigerator fridge;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen() {
        this.oven = new Oven();
        this.dishWasher = new DishWasher();
        this.fridge = new Refrigerator();
        this.coffeeMaker = new CoffeeMaker();
    }
    
    public void addWater() {
        coffeeMaker.setHasWorkToDo(true);
    }
    
    public void pourMilk() {
        fridge.setHasWorkToDo(true);       
    }
    
    public void loadDishWasher() {
        dishWasher.setHasWorkToDo(true);
    }
    
    public void doKitchenWork() {
        coffeeMaker.brewCoffee();
        fridge.orderFood();
        dishWasher.doDishes();
    }
}
