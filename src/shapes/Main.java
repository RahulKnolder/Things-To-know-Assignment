package shapes;


public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 5);
        Triangle triangle = new Triangle(4, 5, 3, 4, 5);

        System.out.println("Circle area: " +circle.getArea());
        System.out.println(" Rectangle area: " +rectangle.getArea());
        System.out.println("Triangle area: " +triangle.getArea());

    }
}