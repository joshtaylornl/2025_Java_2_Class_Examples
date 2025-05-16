package ca.nl.cna.java2.assignmenthelp.a1;

/**
 * A special type of Bank Account
 */
public class ChequingAccount extends BankAccount{

    public static final int FREE_TRANSACTIONS = 3;

    public static final double TRANSACTION_FEE = 2.0;

    private int transactionCount;

    /**
     * Create a chequing account with a balance of 0.
     */
    public ChequingAccount() {
        super();
        transactionCount = 0;
    }

    /**
     * Create a chequing account with an initial balance. Negative balance is ignored.
     * @param balance initial balance
     */
    public ChequingAccount(double balance) {
        super(balance);
        this.transactionCount = 0;
    }

    /**
     * Deposit an amount to the chequing account
     * @param amount amount to deposit
     */
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        transactionCount++;
        if(transactionCount >= FREE_TRANSACTIONS) {
            chargeFees();
        }
    }

    /**
     * Withdraw an amount from the chequing account
     * @param amount amount to withdraw.
     */
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        transactionCount++;
        if(transactionCount >= FREE_TRANSACTIONS) {
            chargeFees();
        }
    }

    /**
     * Charge a transaction fee to the account
     */
    private void chargeFees(){
        this.balance -= TRANSACTION_FEE;
    }

}
