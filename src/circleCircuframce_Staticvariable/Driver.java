package circleCircuframce_Staticvariable;

public class Driver {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0); // create a new Circle object with radius 5
        double circumference = circle.getCircumference(); // calculate the circumference
        System.out.println("Circumference: " + circumference); // prints "Circumference: 31.4159"

    }
}
