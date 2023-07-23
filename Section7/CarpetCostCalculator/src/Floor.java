/**
 * A Floor is:
 * 
 * Floor f = new Floor(Number, Number);
 * 
 * INTERPRETATION: Represents the area of the floor.
 * 
 * @author jason
 */
public class Floor {
    
    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.width = 0;
        } else {
            this.length = length;
        }
    }
    
    public double getArea(){
        return width * length;
    }
    
}
