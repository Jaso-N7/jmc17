
/**
 * Method overloading challenge to convert seconds to hours, minutes and seconds
 *
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-100s -> " + getDurationString(-100));
        System.out.println("70,501s -> " + getDurationString(70_501));
        System.out.println("-20min 500s -> " + getDurationString(-20, 500));
        System.out.println("20min 500s -> " + getDurationString(20, 500));
        System.out.println("20min -> " + getDurationString(20, 0));
        System.out.println("121min 57s -> " + getDurationString(121, 57));
    }

    /**
     * Converts the given seconds into a duration of time
     *
     * @param seconds
     * @return Contains the hours, minutes and seconds
     */
    public static String getDurationString(int seconds) {

        if (!(seconds >= 0)) {

            return "Invalid input error: Seconds (" + seconds + ") must be positive!";
        }

        int minutes = seconds / 60,
                secs = seconds % 60;

        return getDurationString(minutes, secs);

    } // getDurationString :: Seconds -> String

    /**
     * Converts the given arguments into a duration of time.
     *
     * @param minutes
     * @param seconds
     * @return Contains the hours minutes and seconds
     */
    public static String getDurationString(int minutes, int seconds) {

        if (!(minutes >=0)) {
            return "Invalid input error: Minutes (" + minutes + ") must be >=0";
        }
        if(!(seconds >= 0 && seconds <= 59)){
            return "Invalid input error: Seconds (" + seconds + 
                    ") must be within the range 0 - 59!";
        }

        // 1 minute = 60 seconds
        // 1 hour = 60 minutes or 3600 seconds
        int hr = minutes / 60, 
            mins = minutes % 60;
        return hr + "h " + mins + "m " + seconds + "s";
      
    } // getDurationString :: Seconds -> Time

}
