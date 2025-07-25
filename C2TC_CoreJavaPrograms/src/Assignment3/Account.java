package Assignment3;

public abstract class Account {
	protected String accholdername;
	protected double accbal;
	
	public Account(String accholdername, double accbal) {
		
		this.accholdername = accholdername;
		this.accbal = accbal;
		Bank.incrementAccounts();
	}
	
	public abstract void deposit(double amount); 

    public abstract void withdraw(double amount);

    public abstract double getBalance();

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accholdername);
        System.out.println("Balance: ₹" + accbal);
    }
	
	
	
}
	


