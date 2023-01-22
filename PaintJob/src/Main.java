/**
 * Udemy Java Master Class (JDK 17) Coding exercise 29: Paint Job
 * 
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("getBucketCount(-3.4, 2.1, 1.5, 2) => (-1) ? " +
                getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println("getBucketCount(3.4, 2.1, 1.5, 2) => (3) ?  " +
                getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println("getBucketCount(2.75, 3.25, 2.5, 1) => (3) ? " +
                getBucketCount(2.75, 3.25, 2.5, 1));
        
        // Testing overloaded method without extra buckets
        System.out.println("\nNo extra buckets at home:");
        System.out.println("getBucketCount(-3.4, 2.1, 1.5) => (-1) ? " +
                getBucketCount(-3.4, 2.1, 1.5));
        System.out.println("getBucketCount(3.4, 2.1, 1.5) => (5) ? " +
                getBucketCount(3.4, 2.1, 1.5));
        System.out.println("getBucketCount(7.25, 4.3, 2.35) => (14) ? " +
                getBucketCount(7.25, 4.3, 2.35));
        
        // Testing overloaded method without width and height
        System.out.println("\nAlready knows the area of the wall:");
        System.out.println("getBucketCount(3.4, 1.5) => (3) ? " +
                getBucketCount(3.4, 1.5));
        System.out.println("getBucketCount(6.26, 2.2) => (3) ? " + 
                getBucketCount(6.26, 2.2));
        System.out.println("getBucketCount(3.26, 0.75) => (5) ? " +
                getBucketCount(3.26, 0.75));
        System.out.println("getBucketCount(-3.26, 0.75) => (-1) ? " +
                getBucketCount(-3.26, 0.75));
        System.out.println("getBucketCount(3.26, -0.75) => (-1) ? " + 
                getBucketCount(3.26, -0.75));
    }
    
    /**
     * Calculate how many buckets of paint needed to buy before going to work.
     * 
     * @param width The width of the wall
     * @param height The height of the wall
     * @param areaPerBucket The area that can be covered with one bucket of paint
     * @param extraBuckets The bucket count that is at home
     * @return The number of buckets needed to purchase before going to work.
     */
    public static int getBucketCount(double width, double height,
            double areaPerBucket, double extraBuckets){
        
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        
        double areaOfWall = width * height;
        double requiredBuckets = areaOfWall / areaPerBucket;
        return (int) Math.ceil((double) requiredBuckets - extraBuckets);
    }
    
    /**
     * Calculate how many buckets of paint needed to buy before going to work
     * 
     * @param width The width of the wall
     * @param height The height of the wall
     * @param areaPerBucket The area that can be covered with one bucket of paint
     * @return The number of buckets needed to purchase before going to work.
     */
    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width, height, areaPerBucket, 0);
    }
    
    /**
     * Calculate how many buckets of paint needed to buy before going to work
     * 
     * @param area The known area of the wall
     * @param areaPerBucket The area that can be covered with one bucket of paint
     * @return The number of buckets needed to buy before going to work.
     */
    public static int getBucketCount(double area, double areaPerBucket){
        
        if (area < 0 || areaPerBucket < 0) {
            return -1;
        }
        
        return (int) Math.ceil((double) area / areaPerBucket);
    }
}
