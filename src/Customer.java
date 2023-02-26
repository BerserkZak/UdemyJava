public class Customer {
    private String name;
    private String emailAdress;
    private double creditLimit;

    public String getName() {
        return name;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public Customer() {
        this("Default name", "default@email.com", 5000.00);
    }

    public Customer(String name, String emailAdress, double creditLimit) {
        this.name = name;
        this.emailAdress = emailAdress;
        this.creditLimit = creditLimit;
    }

    public Customer(String name, String emailAdress) {
        this(name, emailAdress, 5000.00);
    }
}
