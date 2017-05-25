package bankaccount_and_savingsaccount;/* Travis Davis
 * Assignment 2 - BankAccount & SavingsAccount
 *
 * The SavingsAccounts class keeps track of a persons Savings account balance, withdrawals, deposits, fees and interest.
 *
 * checkAccountStatus will see if getBalance returns a value of 25 or greater. If it does then it will set the status field to true.
 * Otherwise status will be set to false.
 *
 * Withdraw checks the status field to make sure its set to true before allowing a withdrawal. If status is false then it will
 * inform the user.
 *
 * Deposit will check if the account status is false. If the account status is false, and the deposit brings the account balance over $25,
 * the account status will be set to true.
 *
 * monthlyProcess will check the number of withdrawals for the month. If more than 4 withdrawals have been made then a service charge
 * of $1 for each withdrawal after withdrawal number 4 will be added to the monthly service charge. After this is complete, it will call
 * monthlyProcess in the super class, then call checkAccountStatus.
 */

public class SavingsAccount extends BankAccount {
    private boolean status;

    public SavingsAccount() {
        super();
    }



    public SavingsAccount(double balance) {
        super(balance);
    }

    public void checkAccountStatus() {
        if (getBalance() < 25)
            status = false;
        else if (getBalance() >= 25)
            status = true;
    }

    public void Withdraw(double amount) {
        checkAccountStatus();
        if (status == true)
            super.withdraw(amount);
        else System.out.println("Your account is inactive. You must bring your balance above $25.");
    }

    public void Deposit(double amount) {
        checkAccountStatus();
        super.deposit(amount);
        if (status = false && getBalance() >= 25)
            status = true;
    }

    public void monthlyProcess(){
        if(getNumWithdrawals()>4)
            setServiceCharges(getServiceCharges()+(getNumWithdrawals()-4));
        super.monthlyProcess();
        checkAccountStatus();


    }
}
