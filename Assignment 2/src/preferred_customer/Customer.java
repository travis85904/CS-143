package preferred_customer;/* Travis Davis
 * Assignment 2 - Person & Customer Classes
 *
 * This Customer class extends Person.
 *
 * It uses either the constructor, or the mutator methods to set the customer number and whether or not
 * they are on the mailing list.
 *
 * It incorporates the toString method to present the data in an easy to read format.
 */

public class Customer extends Person {
    private int customerNumber;
    private boolean onMailingList;

    public Customer() {

    }

    public Customer(String name, String address, String phoneNumber, int customerNumber, boolean onMailingList) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.onMailingList = onMailingList;
    }

    public Customer(String name, String address, String phoneNumber, int customerNumber) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
    }

    public Customer(int customerNumber, boolean onMailingList) {
        this.customerNumber = customerNumber;
        this.onMailingList = onMailingList;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setOnMailingList(boolean onMailingList) {
        this.onMailingList = onMailingList;
    }

    public boolean isOnMailingList() {
        return onMailingList;
    }

    @Override
    public String toString() {
        String onList;
        if (onMailingList)
            onList = "yes";
        else
            onList = "no";
        return super.toString() + "\nCustomer Number: " + customerNumber + "\nOn mailing list? " + onList;
    }
}
