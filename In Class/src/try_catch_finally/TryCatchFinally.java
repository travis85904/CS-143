package try_catch_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {
    static Scanner scanner = new Scanner(System.in);
    static int age;

    public static void main(String[] args) throws InputMismatchException {
        try {
            howOld();
        } catch (InputMismatchException e ) {
            System.out.println("There was an exception");
            howOld();
        } finally {
            System.out.println("Finally!");
        }
    }

    public static void howOld(){
        System.out.print("How old are you? ");
        age = scanner.nextInt();
    }
}
