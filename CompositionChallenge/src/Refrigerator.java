/**
 * A Refrigerator is:
 * 
 * Refrigerator r = new Refrigerator(boolean);
 * 
 * INTERPRETATION: An IoT Appliance, in this case a refrigerator
 * WHERE: It accepts one boolean argument, that determines if it has
 * work to do.
 * 
 * @author jason
 */
public class Refrigerator {
    
    private boolean hasWorkToDo;
    
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    
    public void orderFood() {
        if(hasWorkToDo){
            System.out.println("Restocking the refrigerator");
            hasWorkToDo = false; // Work completed
        }
    }

}
