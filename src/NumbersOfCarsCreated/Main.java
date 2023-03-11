package NumbersOfCarsCreated;

import NumbersOfCarsCreated.Car;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("Ford", "Mustang");
        System.out.println("Total number of cars created: " + Car.getNumOfCars()); // prints "Total number of cars created: 3"

    }
}