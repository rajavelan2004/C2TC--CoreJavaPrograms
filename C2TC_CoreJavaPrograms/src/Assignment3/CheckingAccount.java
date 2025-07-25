package Assignment3;

public class CheckingAccount extends Account {
    public CheckingAccount(String name, double initialBalance) {
        super(name, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        accbal += amount;
        System.out.println("₹" + amount + " deposited to Checking Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (accbal >= amount) {
            accbal -= amount;
            System.out.println("₹" + amount + " withdrawn from Checking Account.");
        } else {
            System.out.println("Insufficient balance in Checking Account.");
        }
    }

    @Override
    public double getBalance() {
        return accbal;
    }
}
	


