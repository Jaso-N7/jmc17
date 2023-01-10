/**
 *
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int switchValue = 7;
        
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
            System.out.println("Was beyond 2");
                System.out.println("Actually, it was " + switchValue);
                break;
            default:
                System.out.println("An unexpected value was encountered!");
        } 
        
        String month = "april";
        System.out.println(month.toUpperCase() + " is in the " +
                getQuarter(month) + " quarter");
        month = "OCTOBER";
        System.out.println(month + " is in the " +
                getQuarter(month) + " quarter");
        month = "Tammuz";
        System.out.println(month.toUpperCase() + " is in the " +
                getQuarter(month) + " quarter");
    } // end psvm
    
    // demonstrating enhanced SWITCH
    public static String getQuarter(String month){
        
        // return switch was introduced in JDK 12 + 13. Became standard in 14
        // it's really an expression that returns a single value. It can also be
        // assigned to a variable.
        return switch(month.toUpperCase()){
            case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st"; }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };        
    } // getQuarter :: String -> String
    
}
