package bankaccount_and_savingsaccount;/* Travis Davis
 * Assignment 2 - BankAccount & SavingsAccount
 * This class tests the SavingsAccount class by opening a new account with $500, setting the
 * interest rate to 4%, making 6 deposits in the amount of
 * $15 each. checking the balance, running the monthlyProcess method, then checking the balance again.
 */

public class SavingsAccountTest {
    static SavingsAccount savingsAccount;
    static SavingsAccount savingsAccount2;

    public static void main(String[] args) {
        savingsAccount=new SavingsAccount(500);
        savingsAccount.setInterestRate(.04);
        savingsAccount.Withdraw(15);
        savingsAccount.Withdraw(15);
        savingsAccount.Withdraw(15);
        savingsAccount.Withdraw(15);
        savingsAccount.Withdraw(15);
        savingsAccount.Withdraw(15);
        System.out.println(savingsAccount.getNumWithdrawals());

        System.out.println(savingsAccount.getBalance());
        savingsAccount.monthlyProcess();
        System.out.println(savingsAccount.getBalance());
    }
}
