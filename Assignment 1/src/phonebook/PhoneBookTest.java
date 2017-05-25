/* Travis Davis
 * Assignment 7
 *
 * addEntries() creates new PhoneBookEntry objects by adding them to an ArrayList.
 * print() uses a for loop to print each instance of the PhoneBookEntry class on a new line.
 */

package phonebook;

import java.util.ArrayList;

public class PhoneBookTest {
private static ArrayList<PhoneBookEntry> phonebook = new ArrayList<>();
        public static void main(String[] args) {
            addEntries();
            print();
        }
        static void addEntries(){
            phonebook.add(new PhoneBookEntry("Travis", "4258981234"));
            phonebook.add(new PhoneBookEntry("Bob", "2065551234"));
            phonebook.add(new PhoneBookEntry("Jim","4254861234"));
            phonebook.add(new PhoneBookEntry("Rachel","3604841234"));
            phonebook.add(new PhoneBookEntry("Nicole", "2538381234"));
        }
        static void print() {
            //System.out.println(phonebook.toString());
            for (PhoneBookEntry i : phonebook) {
                System.out.println(i);
            }
        }
}

