package org.prog.HM2;

public class Boeing extends Jet {
    public Boeing() {
        super();
        this.model = "Boeing 747";
    }

    public void autopilot() {
        System.out.println(model + " autopilot ON!");
    }

    public void capacityExtraLarge(String number) {
        System.out.println("Capacity of " + model + " is " + number);
    }
}
