package bankaccount_and_savingsaccount;/* Travis Davis
 * Assignment 2 - BankAccount & SavingsAccount
 *
 * The BankAccount class keeps track of balance, interes rate, service charges, number of deposits, and number of withdrawals.
 *
 * There are serveral overloaded contructor methods that the user can use to set the fields, or they can use mutator classes.
 *
 * calcInterest will calcaulate the interest for the month and add it to the balance.
 *
 * monthlyProcess deducts service charges from the balance, calls calcInterest(), and resets numDeposits and numWithdrawals to 0.
 */

public abstract class BankAccount {
    private double balance, interestRate, serviceCharges;
    private int numDeposits, numWithdrawals;

    public BankAccount() {
        //balance = 0;
        //numDeposits = 0;
        //numWithdrawals = 0;
        //interestRate = 0;
        //serviceCharges=0;
    }

    public BankAccount(double balance) {
        this.balance = balance;
        //numDeposits = 0;
        //numWithdrawals = 0;
        //interestRate = 0;
        //serviceCharges=0;
    }

    public BankAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
        //numDeposits = 0;
        //numWithdrawals = 0;
        //serviceCharges=0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setServiceCharges(double serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

    public double getServiceCharges() {
        return serviceCharges;
    }

    public void setNumDeposits(int numDeposits) {
        this.numDeposits = numDeposits;
    }

    public int getNumDeposits() {
        return numDeposits;
    }

    public void setNumWithdrawals(int numWithdrawals) {
        this.numWithdrawals = numWithdrawals;
    }

    public int getNumWithdrawals() {
        return numWithdrawals;
    }

    public void withdraw(double withdrawal) {
        balance -= withdrawal;
        numWithdrawals += 1;
    }

    public void deposit(double deposit) {
        balance += deposit;
        numDeposits += 1;
    }

    public void calcInterest() {
        double monthlyInterest = balance * (interestRate / 12);
        balance += monthlyInterest;
    }

    public void monthlyProcess() {
        balance -= serviceCharges;
        calcInterest();
        numDeposits = 0;
        numWithdrawals = 0;
        serviceCharges = 0;
    }

    @Override
    public String toString() {
        return "Balance: $" + balance + "\nInterest Rate: " + interestRate + "\nDeposits this month: " + numDeposits + "\nWithdrawals this month: "
                + numWithdrawals + "\nService charges this month: " + serviceCharges;
    }
}
