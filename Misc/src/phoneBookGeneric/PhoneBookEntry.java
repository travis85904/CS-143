package phoneBookGeneric;

public class PhoneBookEntry<T> {
    private T name;
    private T number;

    public PhoneBookEntry(T name,T number) {
        this.name = name;
        this.number = number;
    }

    public T getName(){
        return name;
    }

    public T getNumber() {
        return number;
    }

    public String toString() {
        return "Name: " + name
                + " | Phone number: " + number;
    }
}



