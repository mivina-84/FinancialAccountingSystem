package model;

import java.math.BigDecimal;

/**
 * Кошелек
 */
public class Wallet {
    private int id;
    private String name;
    private double balance;

    public Wallet(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

        // Getters and Setters
        public int getId () {
            return id;
        }

        public String getName () {
            return name;
        }

    public void setId(int id) {
        this.id = id;
    }

    public void setName (String name){
            this.name = name;
        }

        public double getBalance () {
            return balance;
        }

        public void setBalance ( double balance){
            this.balance = balance;
        }

        @Override
        public String toString () {
            return "Wallet{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", balance=" + balance +
                    '}';
        }

    }

