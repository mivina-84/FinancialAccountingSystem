package model;

/**
 * Кредитная карта
 */
public class CreditCard {
    private int id;
    private String name;
    private double balance;
    private double creditLimit;

    public CreditCard(int id, String name, double balance, double creditLimit) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
