package BeforeOOP;

public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("123", 2.5, "Dedault name", "Default email",
                "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName,
                       String customerEmail, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        email = customerEmail;
        phoneNumber = customerPhoneNumber;

    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999", 105.4, customerName, email, phoneNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
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
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double moneyToDeposit) {
       setAccountBalance(getAccountBalance() + moneyToDeposit);
    }

    public void withdrawFunds(double moneyToWithdraw) {
        if ( moneyToWithdraw > getAccountBalance()) {
            System.out.println("Insufficient funds");
            return;
        } setAccountBalance(getAccountBalance() - moneyToWithdraw);
    }

}
