package model;

/**
 * Расходы
 */
public class Expense {
    private int id;
    private String description;
    private double amount;
    private boolean isCurrent; // true - текущая затрата, false - потенциальная

    public Expense(int id, String description, double amount, boolean isCurrent) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.isCurrent = isCurrent;
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

    public boolean isCurrent() {
        return isCurrent;
    }

    public void setCurrent(boolean current) {
        isCurrent = current;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", isCurrent=" + isCurrent +
                '}';
    }
}
