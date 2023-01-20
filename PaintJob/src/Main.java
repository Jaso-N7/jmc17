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
        System.out.println("getBucketCount(-3.4, 2.1, 1.5, 2) => " +
                getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println("getBucketCount(3.4, 2.1, 1.5, 2) => " +
                getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println("getBucketCount(2.75, 3.25, 2.5, 1) => " +
                getBucketCount(2.75, 3.25, 2.5, 1));
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
            
        return -1;
    }
    
}
