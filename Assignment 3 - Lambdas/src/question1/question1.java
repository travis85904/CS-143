/**
 * Travis Davis - 5/26/17
 */
package question1;

public abstract class question1 implements IntCalculator{




    public static void main(String[] args) {
        IntCalculator question_1 = new IntCalculator() {
            @Override
            public int calculate(int x) {
                return (x * x) + (2 * x) + 4;
            }
        };

        IntCalculator lambda_1 = x -> (x * x) + (2 * x) + 4;

        System.out.println(question_1.calculate(5));
        System.out.println(lambda_1.calculate(5));
    }
}
