/**
 * A Cuboid is:
 * 
 *  Cuboid cube = new Cuboid(width, length, height);
 * 
 * INTERPRETATION: Any cube shaped object, in this case a pool
 * WHERE: width, length and height are of type double
 * 
 * @author jason
 */
public class Cuboid extends Rectangle {
   
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        
        if (height < 0.0d) {
            this.height = 0.0d;
        } else {
            this.height = height;
        }
        
    }

    public double getHeight() {
        return height;
    }
    
    /**
     * Calculate the volume of any cuboid
     * 
     * @return the calculated volume.
     */
    public double getVolume(){
        return getArea() * height;
    }
}
