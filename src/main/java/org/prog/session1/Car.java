package org.prog.session1;

public class Car {
    public String color;
    public String plateNumber;
    public String enginePower;
    public String fuelType;

    public void goTo(String destination) {
        System.out.println(color + " car " + plateNumber + " going to " + destination + "...");
    }

    public void driveThroughCrossroads() {
        System.out.println("Driving through crossroads");
    }

    public void changeColor(String c) {
        color = c;
    }
}
