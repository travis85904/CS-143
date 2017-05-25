package bankaccount_and_savingsaccount;

/**
 * Travis Davis - 5/4/17
 */
public class Generic {
    public static<T extends Comparable<T>> T greatest(T arg1, T arg2){
        if(arg1.compareTo(arg2)>0)
            return arg1;
        else
            return arg2;
    }


}
