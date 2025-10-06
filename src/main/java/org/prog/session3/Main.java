package org.prog.session3;

import java.io.FileNotFoundException;

//TODO: Write IPhone interface, which can call(), browse() and unlockScreen()
//TODO: Write Androind and iOS classes that implement this interface
//TODO: Android and IOS phones must have screen resultion (String) and Color (String)
//TODO: Write HashCode and Equals for Android and iOS

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Ford ford = new Ford();
        Mazda mazda1 = new Mazda();
        Mazda mazda2 = new Mazda();
        mazda1.color = "blue";
        mazda2.color = "red";
//        driveCar(ford);
//        driveCar(mazda);

        ford.goTo("Dnipro");
        ford.goTo("Odessa", "Kyiv");
        ford.goTo("Lviv", "Kyiv", "Zhytomyr");

        System.out.println(mazda1.equals(mazda2));
        System.out.println(mazda2.equals(mazda1));

    }

    public static void driveCar(ICar iCar) {
        iCar.accelerate();
        iCar.turnLeft();
        iCar.accelerate();
        iCar.brake();
        iCar.turnRight();
        iCar.brake();
    }
}
