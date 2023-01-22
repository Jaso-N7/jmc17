/**
 *
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Imitate opening a new account
        Bank bank = new Bank();
        // Initial opening balance (this is JMD of course)
        bank.setAccountNumber(52766);
        bank.setCustomerName("Stainless Steel Co.");
        bank.setAccountBalance(2_500.00d);
        bank.setTelephone("876-001-00001");
        bank.setEmail("cfo@ss.co");
        
        System.out.println("Customer: " + bank.getCustomerName() + "(" + bank.getAccountNumber() + ")\n" +
                "Email: " + bank.getEmail() + " | Telephone: " + bank.getTelephone() + "\n" +
                "Balance: \u0024" + bank.getAccountBalance() + "\u00A2\n");
        
        // conduct some transactions
        bank.deposit(bank.getAccountNumber(), 285_582.86d);
        bank.withdrawal(bank.getAccountNumber(), 85_000d);
        bank.withdrawal(bank.getAccountNumber(), 900_000d);
        bank.deposit(bank.getAccountNumber(), 2_500);        
        
    }
    
}
