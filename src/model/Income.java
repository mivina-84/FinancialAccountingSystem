package model;

/**
 * Поступление
 */
public class Income {
    private int id;
    private String description;
    private double amount;

    public Income(int id, String description, double amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Income{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }
}
