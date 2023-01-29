/**
 * Exploring the StringBuilder Class
 * 
 * Netbeans: Shift + F6 to run this class
 * 
 * @author jason
 */
public class StringOptions {
    
    public static void main(String[] args) {
        
        String hw = "Hello" + " World";
        hw.concat(" and Goodbye"); // String object is immutable
        
        StringBuilder sb = new StringBuilder("Hello" + " World");
        sb.append(" and Goodbye"); // StringBuilder object is mutable
        
        printInfo(hw);
        printInfo(sb);
        
        StringBuilder empty = new StringBuilder(); // default capacity = 16
        empty.append("a".repeat(57));
        StringBuilder empty32 = new StringBuilder(32);
        empty32.append("a".repeat(17));
        
        printInfo(empty);
        printInfo(empty32);
        
        StringBuilder sbPlus = new StringBuilder("Hello" + " World")
            .append(" and Goodbye")
            .deleteCharAt(16)
            .insert(16, 'g');
        System.out.println(sbPlus);
        
        sbPlus.replace(16, 17, "G");
        System.out.println(sbPlus);
        
        sbPlus.reverse().setLength(7);
        System.out.println(sbPlus);
    }
    
    public static void printInfo(String str){
        System.out.println("String = " + str);
        System.out.println("length = " + str.length());
    }
    
    public static void printInfo(StringBuilder sb){
        System.out.println("StringBuilder = " + sb);
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());
    }
}
