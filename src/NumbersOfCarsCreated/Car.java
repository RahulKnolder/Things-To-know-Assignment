package NumbersOfCarsCreated;

public class Car {
    private static int numOfCars = 0;
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        numOfCars++;
    }

    public static int getNumOfCars() {
        return numOfCars;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
