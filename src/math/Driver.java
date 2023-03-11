package math;

public class Driver {

    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int sum = Calculator.add(x, y);
        int difference = Calculator.subtract(x, y);
        int product = Calculator.multiply(x, y);
        double quotient = Calculator.divide(x, y);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
