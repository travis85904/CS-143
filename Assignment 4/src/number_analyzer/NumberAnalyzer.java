/**
 * Travis Davis - 5/13/17
 *
 * The NumberAnalyzer class accepts an array of Number objects as an argument.
 * It can return the Max, Min, Average and Total
 */
package number_analyzer;

public class NumberAnalyzer<T extends Number> {
    private T[] numbers;

    public NumberAnalyzer(T[] numbers) {
        this.numbers = numbers;
    }

    //
    // Get largest number in the array
    public T largest() {
        T largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i].doubleValue() > largest.doubleValue())
                largest = numbers[i];
        }
        return largest;
    }

    //
    // Get smallest number in array
    public T smallest() {
        T smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i].doubleValue() < smallest.doubleValue())
                smallest = numbers[i];
        }

        return smallest;
    }

    //
    // Get the total of all the numbers in the array
    public double total() {
        double total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i].doubleValue();
        }

        return total;
    }

    //
    // Get the average
    public double average() {
        return total() / numbers.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Number number : numbers) {
            sb.append(number + ",");
        }

        return sb.toString();
    }
}
