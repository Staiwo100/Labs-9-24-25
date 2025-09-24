public class MathHelper {
    // TODO: Implement these methods

    // 1. Create a method called 'calculateSum' that takes two integers
    public static int calculateSum(int i1, int i2) {
       int sum = i1 + i2;
       return sum;
    }

    // 2. Create a method called 'findMin' that takes two integers
    public static int findMin(int num1, int num2) {
        int themin;
        if (num1 > num2) {
            themin = num2;
        } else {
            themin = num1;
        }
        return themin;
    }

    // 3. Create a void method called 'printResult' that takes an integer
    //    and prints "The result is: [number]"
    public static void printResult(int theint) {
        System.out.println("The result is: " + theint);
    }

    public static void main(String[] args) {
        // Test your methods here
        int sum = calculateSum(15, 25);
        int min = findMin(10, 20);
        printResult(sum);
        printResult(min);
    }
}
