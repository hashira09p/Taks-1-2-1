import static java.lang.Math.*;

public class MathOperations {

    public static int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return Math.floorDiv(a, b);
    }

    public static void main(String[] args) {
        System.out.println(add( 3,  2));
        System.out.println(subtract( 3,  2));
        System.out.println(multiply( 3,  2));
        System.out.println(divide( 3,  2));
    }
}
