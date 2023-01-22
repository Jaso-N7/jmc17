/**
 * Contains the characteristics of a banking institution
 * 
 * @author jason
 */
public class Bank {
    
    private long accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String telephone;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        
        if (customerName != null){
            this.customerName = customerName;
        } else {
            this.customerName = "Chappah";
        }
    }

    /**
     * Get the clients email
     * @return 
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the clients email address
     * 
     * @param email 
     */
    public void setEmail(String email) {
        
        if(email != null){
            this.email = email;
        } else {
            this.email = "anon@no-reply.com";
        }
        
    }

    /**
     * Clients telephone
     * @return 
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the telephone number
     * @param telephone 
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    /**
     * Deposit money into customers account
     * 
     * @param account
     * @param money 
     */
    public void deposit(long account, double money){
       
        double currentBalance = this.getAccountBalance();
        double newBalance = money + currentBalance;
        this.setAccountBalance(newBalance);
        
        System.out.println(accountDetails(this.getAccountNumber(),
                "Deposited " + money + "\nNew Balance: \u0024" + 
                        this.getAccountBalance() + "\u00A2"));
    }
    
    /**
     * Withdraw money from the account
     * 
     * @param account
     * @param money 
     */
    public void withdrawal(long account, double money){
    
        // Withdrawals are not possible
        if(this.getAccountBalance() == 0.0d){
            System.out.println(accountDetails(account,
                    "Insufficient funds\nCurrent balance: \u0024" +
                            this.getAccountBalance()));
            return;
        }
        
        double currentBalance = this.getAccountBalance();
        double newBalance = currentBalance - money;
        
        if(newBalance < 0.0d){
            
            System.out.println(accountDetails(this.getAccountNumber(),
                    "Insufficient funds, please withdraw a smaller amount.\nAttempted to withdraw: \u0024" +
                            money + 
                            "\u00A2\nCurrent balance: \u0024" + currentBalance + "\u00A2"));
            
        } else {
            
            this.setAccountBalance(newBalance);
            System.out.println(accountDetails(account,
                    "Withdrew: \u0024" + money + "\u00A2\n" +
                    "New balance: \u0024" + this.getAccountBalance() + "\u00A2"));
            
        }
 
    }
    
    /**
     * Prints transaction details for the specified account
     * 
     * @param account The account being affected by the transaction
     * @param transaction The details regarding the transaction
     * @return Information on the account
     */
    public String accountDetails(long account, String transaction){
                
        return "Account #: " + account + "\n" + transaction;
    }
}
