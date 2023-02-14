/**
 * <pre>String Comparison methods:
 * substring
 * join
 * concat
 * replace
 * replaceFirst
 * repeat (JDK 11)
 * indent (JDK 15)
 * strip
 * stripLeading
 * stripTrailing
 * trim
 * toLowerCase
 * toUpperCase
 * </pre>
 *
 * @author jason
 */
public class StringMethods {

    public static void main(String[] args) {

        String birthDate = "1981/03/09"; // yyyy/mm/dd
        int startingIndex = birthDate.indexOf("1981");
        System.out.format("startingIndex = %d %n", startingIndex);
        System.out.format("Birth Year = %s %n",
                birthDate.substring(startingIndex, birthDate.indexOf('/')));

        System.out.format("Birth Month = %s %n",
                birthDate.substring(5, 7));

        String newDate = String.join("/", "1981", "03", "13");
        System.out.format("newDate = %s%n", newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.format("newDate = %s%n", newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.format("newDate = %s%n", newDate);

        System.out.format("%s%n", newDate.replace('/', '-'));
        System.out.format("%s%n", newDate.replace("2", "00"));

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }

}
