/**
 *
 * @author jason
 */
public class Customer {
    
    private String name;
    private double creditLimit;
    private String email;

    // Getters
    
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    // Constructors
    
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer() {
        this("J. Q. Public", 20_000d, "anon@no-reply.com");
    }

    public Customer(String name, String email) {
        this(name, 20_000d, email);
    }
    
    
    
}
