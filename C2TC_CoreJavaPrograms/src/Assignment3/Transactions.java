package Assignment3;

public class Transactions {
    private final double transactionFee = 10.0; 

    public final void performTransaction(Account account, String type, double amount) {
        System.out.println("\nPerforming " + type + " transaction...");
        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
            applyTransactionFee(account);
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount);
            applyTransactionFee(account);
        } else {
            System.out.println("Invalid transaction type.");
        }
    }

    private void applyTransactionFee(Account account) {
        account.withdraw(transactionFee); 
        System.out.println("Transaction fee of ₹" + transactionFee + " applied.");
    }
}


