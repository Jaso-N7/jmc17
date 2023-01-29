/**
 * A Cylinder is:
 * 
 *   Cylinder cy = new Cylinder(double, double);
 * 
 * INTERPRETATION: A cylindrical object of radius and height.
 * WHERE: radius and height must be double
 * 
 * @author jason
 */
public class Cylinder extends Circle {
   
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }
    
    /**
     * Calculates the cylindrical volume
     * 
     * @return the volume of the Cylinder
     */
    public double getVolume() {
        return getArea() * height;
    }
    
    
}
