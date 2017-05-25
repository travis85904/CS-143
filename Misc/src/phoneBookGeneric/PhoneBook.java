/**
 * Travis Davis - 5/12/17
 */
package phoneBookGeneric;

import java.util.ArrayList;

public class PhoneBook<T extends PhoneBookEntry> {
    private ArrayList<PhoneBookEntry> phoneBookEntries = new ArrayList<PhoneBookEntry>();

    public void add(T entry){
        phoneBookEntries.add(entry);
    }

    public String toString() {

        for (PhoneBookEntry entry:phoneBookEntries) {
            System.out.println("Name: " + entry.getName()
                    + " | Phone number: " + entry.getNumber());
        }
return "";
    }
}
