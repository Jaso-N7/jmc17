/**
 *
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Customer customer = new Customer();
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: "+ customer.getEmail());
        System.out.println("Credit Limit: \u0024" + 
                customer.getCreditLimit() + "\u00A2");
        
        
    }
    
}
