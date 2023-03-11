package ExponentialFunction;

import java.util.Scanner;

public class MathUtils {
    public static final double E = 2.71828;

    public static double calculateExponential(double exponentValue) {
        double exponentialValue = Math.pow(E, exponentValue);
        return exponentialValue;
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("enter the value");
        double exponentialValue = MathUtils.calculateExponential(read.nextInt());
        System.out.println("Exponential value: " + exponentialValue);
    }
}
