package entities;

public class Account {
    public final static double DEPOSIT_FEE_PERCENTAGE = 0.02;
    private Double balance;

    public Account() {}

    public Account(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            amount -= (amount * DEPOSIT_FEE_PERCENTAGE);
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
    }

    public double fullWithdraw() {
        double aux = balance;
        balance = 0.0;
        return aux;
    }
}
