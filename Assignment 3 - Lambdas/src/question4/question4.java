/**
 * Travis Davis - 5/26/17
 */
package question4;

public abstract class question4 implements IntCalculator{
    public static void main(String[] args) {

        IntCalculator question_4 = new IntCalculator() {
            @Override
            public int calculate(int x) {
                if (x <= 0)
                    return 1;
                return x;
            }
        };

        IntCalculator lambda_4 = x -> {if (x <= 0) return 1; return x;};

        System.out.println(question_4.calculate(5));
        System.out.println(lambda_4.calculate(5));
    }
}
