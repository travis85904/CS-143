package point_demo;

/**
 * Travis Davis - 5/2/17
 */
public class TestPgm {

    public static void main(String[] args) {
        testWithoutArgument();
    }

    private static void testWithoutArgument() {

        //Integer and Double
        Integer x = new Integer(1);
        Double y = new Double(7.5);

        //point_demo object to hold an Integer and a Double
        Point myPoint = new Point(x, y);


        //Doubles
        Double doubleX = new Double(3.5);
        Double doubleY = new Double(7.5);

        //point_demo object to hold Doubles
        Point<Double> dPoint = new Point<Double>(doubleX, doubleY);

        //Integers
        Integer intX = new Integer(10);
        Integer intY = new Integer(20);

        //point_demo object to hold Integers
        Point<Integer> iPoint = new Point<Integer>(intX, intY);

        System.out.println("myPoint X: " + myPoint.getX());
        System.out.println("myPoint Y: " + myPoint.getY());

        System.out.println("dPoint X: " + dPoint.getX());
        System.out.println("dPoint Y: " + dPoint.getY());

        System.out.println("iPoint X: " + iPoint.getX());
        System.out.println("iPoint Y: " + iPoint.getY());

        System.out.println("myPoint X times 2: "+myPoint.returningAGenericObject(myPoint).getX());
        System.out.println("myPoint Y times 2: "+myPoint.returningAGenericObject(myPoint).getY());
    }


}
