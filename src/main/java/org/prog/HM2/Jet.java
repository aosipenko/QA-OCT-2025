package org.prog.HM2;

public class Jet extends MotorPlane {

    public Jet() {
        super();
        this.model = "Jet Gulfstream";

    }

    public void capacityMedium(String number) {
        System.out.println("Capacity of " + model + " is " + number);
    }
}
