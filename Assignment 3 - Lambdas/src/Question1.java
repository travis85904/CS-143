/**
 * Travis Davis - 4/29/17
 */
public class Question1{
    IntCalculator calculate = new IntCalculator() {
        @Override
        public int calculate(int x) {
            return (x * x) + (2 * x) + 4;
        }
    };
    IntCalculator labmda = x -> { return (x * x) + (2 * x) + 4; };


}
