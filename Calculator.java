public class Calculator {
    // TODO: Create multiple versions of a 'multiply' method that can handle:
    // 1. Two integers
    public static int multiply(int i1, int i2) {
        return i1 * i2;
    }
    // 2. Three integers
    public static int multiply(int i1, int i2, int i3) {
        return i1 * i2 * i3;
    }
    // 3. Two double values
    public static double multiply (double i1, double i2) {
        return i1 * i2;
    }
    // 4. An integer and a string (repeat the string that many times)
    public static String multiply(int i1, String t1) {
        String thetext = "";
        for (int i = 0; i < i1; i++) {
            thetext+=t1;
        }
        return thetext;
    }

    public static void main(String[] args) {
        // Test all your overloaded methods
        System.out.println("Two ints: " + multiply(5, 3));
        System.out.println("Three ints: " + multiply(5, 3, 2));
        System.out.println("Two doubles: " + multiply(5.5, 3.2));
        System.out.println("Int and string: " + multiply(3, "Hi!"));
    }
}
