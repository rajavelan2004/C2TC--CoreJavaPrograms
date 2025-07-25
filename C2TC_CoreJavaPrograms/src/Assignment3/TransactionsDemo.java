package Assignment3;

public class TransactionsDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Maha", 5000);
        CheckingAccount ca = new CheckingAccount("Manohar", 8000);

        Transactions transaction = new Transactions();

        sa.displayAccountInfo();
        transaction.performTransaction(sa, "deposit", 1000);
        transaction.performTransaction(sa, "withdraw", 2000);
        sa.displayAccountInfo();

        System.out.println();

        ca.displayAccountInfo();
        transaction.performTransaction(ca, "deposit", 1500);
        transaction.performTransaction(ca, "withdraw", 1000);
        ca.displayAccountInfo();

        System.out.println("\nTotal bank accounts: " + Bank.gettotacc());
    }
}


