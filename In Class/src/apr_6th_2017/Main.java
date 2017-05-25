package apr_6th_2017;

public class Main {
    private static char cc;
    public static char ct;
    StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        char cc = 'ñ';
        char ct = 'n';
        checkChar(cc);
        int count = 0;
        for (int i = 0; i < 5; i++)
            count += 1;
        System.out.println(count);
        tokens();

    }

    public static void checkChar(char c) {
        if (Character.isLetter(c)) System.out.println(c + " is a letter!");
        else System.out.println("nope...");
        System.out.println(ct);
    }

    public static void tokens () {
        String[] tokens={};
    }
}
