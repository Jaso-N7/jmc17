/**
 *
 * @author jason
 */
public class Appliance {
    
    private boolean hasWorkToDo = false;

    public Appliance(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }
     
}

class Refrigerator extends Appliance {

    private boolean hasWorkToDo;
    
    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }
    
    @Override
    public boolean getHasWorkToDo(){
        return super.getHasWorkToDo();
    }
    
    public void orderFood() {}
}

class DishWasher extends Appliance {

    private boolean hasWorkToDo;
    
    public DishWasher(boolean hasWorkToDo){
        super(hasWorkToDo);
    }
    
    public void doDishes() {
    
    }
}

class CoffeeMaker extends Appliance {

    private boolean hasWorkToDo;
    
    public CoffeeMaker(boolean hasWorkToDo){
        super(hasWorkToDo);
    }
    
    public void brewCoffee(){
    
    }
}

class Oven extends Appliance {

    public Oven (boolean hasWorkToDo){
        super(hasWorkToDo);
    }
}