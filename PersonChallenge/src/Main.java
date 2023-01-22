/**
 * Udemy Java Master Class (JDK 17) Person class coding exercise 31
 * 
 * @author jason
 */
public class Main {

    /**
     * Testing the Person class
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        
        person.setLastName("Smith");
        System.out.println("fullName= " + person.getFullName());
           
    }
    
}
