package org.prog.HM2;

public class Biplane extends Plane {
    public void flyTo(String destination) {

        System.out.println(model + " flying to " + destination + "...");
    }
    public Biplane() {

        this.model = "Biplane An-2";
    }

    public void capacitySmall (String number) {
        System.out.println("Capacity of " + model + " is " + number);
    }

}
