/**
 * Travis Davis - 5/26/17
 */
package question3;

public abstract class question3 implements DoubleCalculator {
    public static void main(String[] args) {

        DoubleCalculator circle = new DoubleCalculator() {
            public double calculate(double r) {
                return Math.PI * r * r;
            }
        };

        DoubleCalculator circle_lambda = r -> Math.PI * r * r;

        System.out.println(circle.calculate(5));
        System.out.println(circle_lambda.calculate(5));
    }
}
