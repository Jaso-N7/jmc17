/**
 * A Rectangle is:
 * 
 *   Rectangle r = new Rectangle(width, length)
 * 
 * INTERPRETATION: Represents a rectangle of given width and length
 * WHERE: width and length are of type double.
 * 
 * @author jason
 */
public class Rectangle {
   
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        
        if (width < 0.0d) {
            this.width = 0.0d;
        } else {
            this.width = width;
        }
        
        if (length < 0.0d) {
            this.length = 0.0d;
        } else {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    
    /**
     * Calculates the area of a rectangle
     * @return the area
     */
    public double getArea() {
        return width * length;
    }
    
}
