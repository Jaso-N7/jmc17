/**
 * A Circle is:
 * 
 *  Circle c = new Circle(double);
 * 
 * INTERPRETATION: Represents any Circular object with a radius of type double
 * 
 * @author jason
 */
public class Circle {
   
    private double radius;

    public Circle(double radius) {
        
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
        
    }

    public double getRadius() {
        return radius;
    }
    
    /**
     * Calculate the area of a Circle
     * 
     * @return the area of the Circle
     */
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
