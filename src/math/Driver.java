package math;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter firtst number");
        int numberOne = read.nextInt();

        System.out.println("Enter second number");
        int numberTwo = read.nextInt();

        int sum = Calculator.add(numberOne, numberTwo);
        int difference = Calculator.subtract(numberOne, numberTwo);
        int product = Calculator.multiply(numberOne, numberTwo);
        double quotient = Calculator.divide(numberOne, numberTwo);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
