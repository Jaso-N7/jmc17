/**
 *
 * @author jason
 */
public class Oven {
    
    private boolean hasWorkToDo;
    
    public Oven(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    
    public void preheat(double degrees) {
        System.out.println(String.format(
        "Preheating to %f%n", degrees));
    }
}
