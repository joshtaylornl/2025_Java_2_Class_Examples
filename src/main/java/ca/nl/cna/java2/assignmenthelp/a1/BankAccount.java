package ca.nl.cna.java2.assignmenthelp.a1;

/**
 * Parent class for all accounts in this package
 */
public class BankAccount {

    //This does not feel right!
    //If you make this private you need to add methods for transferIn and transferOut
    protected double balance;

    /**
     * Create an account with no initial balance
     */
    public BankAccount() {
        this.balance = 0;
    }

    /**
     * Create an account with an initial balance. If balance is negative the balance is set to 0.
     * @param balance initial balance
     */
    //TODO Add the exception here
    public BankAccount(double balance) throws InvalidAccountActionException {
        if(balance > 0){
            this.balance = balance;
        } else {
            throw new InvalidAccountActionException("Can't create an account with balance less than 0");
        }
    }

    /**
     * Get the current account balance
     * @return account balance
     */
    public final double getBalance() {
        return balance;
    }

    /**
     * Deposit funds into the account. Negative deposit is ignored.
     * @param amount amount to deposit
     */
    //TODO Add the exception here
    public void deposit(double amount) {
        if(amount > 0){
            this.balance += amount;
        }
    }

    /**
     * Withdraw funds from the account. Negative amount is ignored.
     * If funds are not sufficient then the withdrawal is ignored.
     * @param amount amount to withdraw.
     */
    //TODO Add the exception here
    public void withdraw(double amount) {
        if(amount > 0 && this.balance >= amount){
            this.balance -= amount;
        }
    }

    /**
     * Transfer funds from this bank acount to the destination account
     * @param destination destination for banking funds
     * @param amount amount to transfer
     */
    public void transferTo(BankAccount destination, double amount) {
        transfer(this, destination, amount);
    }

    /**
     * Tranfer funds from source bank account to destination
     * @param destination destination for funds
     * @param source source of funds
     * @param amount amount to transfer
     */
    public static void transfer(BankAccount source, BankAccount destination, double amount) {
        if(amount > 0 && source.balance >= amount){
            source.balance -= amount;
            destination.balance += amount;
        }
    }



    /*

Contains a transferAmt method that will transfer money from one bank account to another bank account. This method will take two arguments, a BankAccount object and an amount (i.e. BankAccount account, double amount)
     */

}
