package org.prog.session3;

public class Ford implements ICar {

    public void goTo(String destination) {
        goTo(destination, "current location");
    }

    public void goTo(String destination, String from) {
        goTo(destination, from, "nowhere");
    }

    public void goTo(String destination, String from, String stoppingAt) {
        System.out.println("For is going to " + destination + " from "
                + from + " stopping at " + stoppingAt);
    }

    public void accelerate() {
        System.out.println("Ford accelerates");
    }

    public void brake() {
        System.out.println("Ford brakes");
    }

    public void turnLeft() {
        System.out.println("Ford turn left");
    }

    public void turnRight() {
        System.out.println("Ford turn right");
    }
}
