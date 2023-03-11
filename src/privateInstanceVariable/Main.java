package privateInstanceVariable;

public class Main {
    public static void main(String[] args) {
        Details deatilsObject = new Details();
        deatilsObject.setMyNumber(42);
        System.out.println(deatilsObject.getMyNumber()); // Prints 42
    }
}
