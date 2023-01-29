/**
 *
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        printInformation("Hello World");
        printInformation("");
        printInformation("\t    \n");
        
        String helloWorld = "Hello World";
        System.out.format("index of 'r' = %d %n", helloWorld.indexOf('r'));
        System.out.format("index of \"World\" = %d %n", helloWorld.indexOf("World"));
        
        System.out.format("index of 'l' = %d %n", helloWorld.indexOf('l'));
        System.out.format("index of last 'l' = %d %n", helloWorld.lastIndexOf('l'));
        
        System.out.format("index of second 'l' = %d %n",
                helloWorld.indexOf('l', 3));
        System.out.format("index of second 'l' from last 'l' = %d %n",
                helloWorld.lastIndexOf('l', 8));

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }
        
        if(helloWorld.startsWith("Hello"))
            System.out.println("String starts with Hello");
        
        if(helloWorld.endsWith("World"))
            System.out.println("String ends with World");
        
        if(helloWorld.contains("World"))
            System.out.println("String contains World");
        
        if(helloWorld.contentEquals("Hello World"))
            System.out.println("Values match exactly");
    }
 
    public static void printInformation(String string){
    
        int length = string.length();
        System.out.format("length = %d %n", length);
        
        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return ;
        }
        
        if(string.isBlank()){
            System.out.println("String is Blank");
        }
        System.out.format("First char = %c %n", string.charAt(0));
        
        System.out.format("Last char = %c %n", string.charAt(length - 1));
    }
}
