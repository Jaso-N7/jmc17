/**
 *
 * @author jason
 */
public class CoffeeMaker {
    
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    
    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing coffee");
        }
    }
}
