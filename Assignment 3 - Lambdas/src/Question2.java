/**
 * Travis Davis - 4/29/17
 */
public abstract class Question2 implements DoubleCalculator {
    DoubleCalculator calculate = new DoubleCalculator() {


        public double calculate(double x, double y) {
            return Math.pow(x, y);
        }

        @Override
        public double calculate(double r) {
            return 0;
        }
    };
}
