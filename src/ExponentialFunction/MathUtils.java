package ExponentialFunction;

public class MathUtils {
    public static final double E = 2.71828;

    public static double calculateExponential(double exponentValue) {
        double exponentialValue = Math.pow(E, exponentValue);
        return exponentialValue;
    }

    public static void main(String[] args) {
        double exponentialValue = MathUtils.calculateExponential(2.5);
        System.out.println("Exponential value: " + exponentialValue);
    }
}
