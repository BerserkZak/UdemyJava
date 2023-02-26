public class BankAccount {
    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int moneyToDeposit) {
        accountBalance = getAccountBalance() + moneyToDeposit;
    }

    public int withdrawFunds(int moneyToWithdraw) {
        if ( moneyToWithdraw > getAccountBalance()) {
            System.out.println("Insufficient funds");
            return -1;
        } return accountBalance = getAccountBalance() - moneyToWithdraw;
    }

}
