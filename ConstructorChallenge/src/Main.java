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
        
        System.out.println("");
        
        Customer c = new Customer("John Doe",
                50_000d,
                "jd@proton.me");
        System.out.println("Name: " + c.getName());
        System.out.println("Email: "+ c.getEmail());
        System.out.println("Credit Limit: \u0024" + 
                c.getCreditLimit() + "\u00A2");
        
        System.out.println("");
        
        Customer d = new Customer("Jane Doe", "jade@swisscows.org");
        System.out.println("Name: " + d.getName());
        System.out.println("Email: "+ d.getEmail());
        System.out.println("Credit Limit: \u0024" + 
                d.getCreditLimit() + "\u00A2");
    }
    
}
