package circleCircuframce_Staticvariable;

public class Circle {
    public static final double PI = 3.14159; // static variable for PI
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }


}
