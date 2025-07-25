package Assignment3;

public class SavingsAccount extends Account {
    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance); // Call the constructor of Account
    }

    @Override
    public void deposit(double amount) {
        accbal += amount;
        System.out.println("₹" + amount + " deposited to Savings Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (accbal >= amount) {
            accbal -= amount;
            System.out.println("₹" + amount + " withdrawn from Savings Account.");
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    @Override
    public double getBalance() {
        return accbal;
    }
}


