/**
 * Travis Davis - 4/29/17
 */
public class Question4 {
    IntCalculator calculate = new IntCalculator() {
        @Override
        public int calculate(int x) {
            if (x <= 0)
                return 1;
            return x;
        }
    };

    IntCalculator lambda = x -> { if (x <= 0) return 1; return x; };
}
