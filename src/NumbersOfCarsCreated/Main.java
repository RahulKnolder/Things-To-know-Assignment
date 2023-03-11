package NumbersOfCarsCreated;

import NumbersOfCarsCreated.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("enter name if two cars");
        Car car1 = new Car(read.nextLine(), read.nextLine());

        System.out.println("enter name if two cars");
        Car car2 = new Car(read.nextLine(), read.nextLine());

        System.out.println("enter name if two cars");
        Car car3 = new Car(read.nextLine(), read.nextLine());
        System.out.println("Total number of cars created: " + Car.getNumOfCars()); // prints "Total number of cars created: 3"

    }
}