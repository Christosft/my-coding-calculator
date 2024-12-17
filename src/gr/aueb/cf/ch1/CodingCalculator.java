package gr.aueb.cf.ch1;

public class CodingCalculator {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = 0;

        result = add(num1, num2);

        System.out.println("Sum: " +result);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int div(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println("Error. Denominator must not be zero. ");
            throw e;
        }
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int mod(int a, int b) {

        try {
            return a % b;
        } catch (ArithmeticException e) {
            System.err.println("Error. Denominator must not be zero. ");
            throw e;
        }
    }
}
