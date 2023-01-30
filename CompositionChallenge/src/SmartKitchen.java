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
    
    public void addWater() {
        coffeeMaker.setHasWorkToDo(true);
        coffeeMaker.brewCoffee();
    }
    
    public void pourMilk() {
        fridge.setHasWorkToDo(true);
        fridge.orderFood();
    }
    
    public void loadDishWasher() {
        dishWasher.setHasWorkToDo(true);
        dishWasher.doDishes();
    }
    
    public void doKitchenWork() {
        addWater();
        pourMilk();
        loadDishWasher();
    }
}
