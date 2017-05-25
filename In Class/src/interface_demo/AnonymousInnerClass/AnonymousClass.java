package interface_demo.AnonymousInnerClass;

import java.util.Scanner;

/**
 * Travis Davis - 4/28/17
 */
public class AnonymousClass {
    public static void main(String[] args) {
        int num;
        Scanner keyboard = new Scanner(System.in);

//        IntCalculator square = new IntCalculator() {
//            @Override
//            public int calculate(int number) {
//                return number * number;
//            }
//        };
        IntMultiply multiply = (num1, num2) -> num1*num2;
        IntExponent square = number -> number * number;
        IntExponent cube = number -> number * number * number;
        System.out.print("Enter an int that you would like to square: ");
        num = keyboard.nextInt();
        System.out.println(num + " squared is " + square.calculate(num));
        System.out.println(cube.calculate(num));
    }
}
