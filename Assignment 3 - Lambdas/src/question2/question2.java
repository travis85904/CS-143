/**
 * Travis Davis - 5/26/17
 */
package question2;

public abstract class question2 implements DoubleCalculator {
    public static void main(String[] args) {

        DoubleCalculator question_2 = new DoubleCalculator() {
            public double calculate(double x, double y) {
                return Math.pow(x, y);
            }
        };

        DoubleCalculator lambda_2 = (x, y) -> Math.pow(x, y);

        System.out.println(question_2.calculate(5,3));
        System.out.println(lambda_2.calculate(5,3));
    }
}
