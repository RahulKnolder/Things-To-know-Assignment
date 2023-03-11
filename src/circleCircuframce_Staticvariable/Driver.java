package circleCircuframce_Staticvariable;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("enter the radius");
        Circle circle = new Circle(read.nextInt()); // create a new Circle object with radius 5
        double circumference = circle.getCircumference(); // calculate the circumference
        System.out.println("Circumference: " + circumference); // prints "Circumference: 31.4159"

    }
}
