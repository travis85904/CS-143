/**
 * Travis Davis - 5/13/17
 *
 * This is a test of the NumberAnalyzer class
 * An array of Integer is created with a few numbers inside
 *
 * Then an instance of NumberAnalyzer is instantiated, passing the Integer array as argument.
 *
 * Then it will use the methods of the NumberAnalyzer class to print the Total, Avg, Largest, and Smallest.
 */
package number_analyzer;


public class Test {
    private static Integer[] integers = new Integer[]{999,1,2,3,4,5,0,99};
    //private static Double[] doubles = new Double[]{2.4,5.5,0.5,3.45};
    private static NumberAnalyzer numberAnalyzer = new NumberAnalyzer(integers);




    public static void main(String[] args) {
        System.out.println(numberAnalyzer);
        System.out.println("Total: "+numberAnalyzer.total());
        System.out.println("Avg: "+numberAnalyzer.average());
        System.out.println("Largest: "+numberAnalyzer.largest());
        System.out.println("Smallest: "+numberAnalyzer.smallest());
    }



}
