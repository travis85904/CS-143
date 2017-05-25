package number_analysis;
/* Travis Davis
 * Assignment 1 - Number Analysis
 *
 * The number_analysis takes path of a file which contains some numbers. It will then read all the numbers, and put them into
 * an array. It will then display the min, max, average, and total of all the numbers.
 */

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class NumberAnalysis {
    double[] numAry;
    double max, min, total, avg;
    File file;
    Scanner scanner;
    static NumberAnalysis numberAnalysis;

    public static void main(String[] args) throws IOException {
        numberAnalysis = new NumberAnalysis("/Users/Travis/Google Drive/school/cs 143/Assignment 1/number_analysis/src/myfile.txt");
        numberAnalysis.makeArray();
        numberAnalysis.sort();
        numberAnalysis.numStatistics();
        numberAnalysis.printNumbers();
    }

    public NumberAnalysis(String fileName) throws IOException {
        numAry = new double[0];
        scanner = new Scanner(new File(fileName));
    }

    public void makeArray() {
        int i = 0;

        while (scanner.hasNextInt()) {
            numAry = Arrays.copyOf(numAry, numAry.length + 1);
            numAry[i++] = scanner.nextInt();
        }
    }

    private void sort() {
        Arrays.sort(numAry);
    }

    private void numStatistics() {
        min = numAry[0];
        max = numAry[numAry.length - 1];
        total = DoubleStream.of(numAry).sum();
        avg = total / numAry.length;
    }

    private void printNumbers() {
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + avg);
        System.out.println("Total: " + total);
    }
}
