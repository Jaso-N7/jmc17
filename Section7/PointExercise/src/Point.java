/**
 * A Point is a:
 * 
 * Point p = new Point()
 * 
 * INTERPRETATION: Represents a point in 2D space
 * 
 * @author jason
 */
public class Point {
    
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
   
    public double distance(){
        return distance(0, 0);
    }
    
    public double distance(int x, int y){
        
        int xPlane = this.x - x;
        int yPlane = this.y - y;
        
        return Math.sqrt(xPlane * xPlane + yPlane * yPlane);
    }
    
    public double distance(Point p){
        return distance(p.getX(), p.getY());
    }
}
