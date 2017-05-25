package interface_demo.Interfaces;

/**
 * Travis Davis - 4/28/17
 */
public interface Displayable {
    void display();

    default void displayDefault() {
        System.out.println("this is the Displayable interface");
    }
}
