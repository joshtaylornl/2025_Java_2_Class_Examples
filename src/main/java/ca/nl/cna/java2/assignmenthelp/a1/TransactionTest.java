package ca.nl.cna.java2.assignmenthelp.a1;

import java.util.Random;

public class TransactionTest {

    public static void main(String[] args) {
        System.out.println("Fun with Bank Transactions");

        Random rand = new Random();
        double amount = rand.nextInt(100);

        ChequingAccount account = null;
        try {
            account = new ChequingAccount(-10000);
        } catch (InvalidAccountActionException e) {
            System.err.println(e.getMessage());
        }

        for (int i = 0; i < 10; i++) {
            double withdrawAmount = rand.nextInt(100);
            account.withdraw(withdrawAmount);
            System.out.printf("\nWithdraw: %.2f%n", withdrawAmount);
            System.out.printf("\nBank balance: %.2f%n", account.getBalance());
        }


    }

}
