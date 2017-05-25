package customer;/* Travis Davis
 * Assignment 2 - Person & Customer Classes
 *
 * The Person class has fields for a persons name, address, and phone number.
 * You can either pass them as arguments to the constructor, or use the mutator methods to set them.
 * The toString method presents the data in an easy to read format.
 */

public class Person {
    private String name, address, phoneNumber;

    public Person() {

    }

    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: "+name+"\nAddress: "+address+"\nPhone Number: "+phoneNumber;
    }
}
