package org.prog.session1;

public class CarService {

    public void paintCar(Car car, String color) {
        car.color = color;
    }

    public void incrementNumber(int number) {
        number = number + 1;
        System.out.println("number: " + number);
    }

    public void incrementNumber2(int number) {
        number = number + 50;
        System.out.println("number: " + number);
    }
}
