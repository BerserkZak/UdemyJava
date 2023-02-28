package BeforeOOP;

public class Customer {
    private String name;
    private String emailAddress;
    private double creditLimit;

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public Customer() {
        this("Default name", "default@email.com");
    }

    public Customer(String name, String emailAddress) {
        this(name, emailAddress, 5000.00);
    }


    public Customer(String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

}
