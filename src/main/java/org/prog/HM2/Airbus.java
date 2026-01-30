package org.prog.HM2;

public class Airbus extends Jet {
    public Airbus() {
        super();
        this.model = "Airbus A320";
    }

    public void capacityLarge(String num) {
        System.out.println("Capacity of " + model + " is " + num);
    }
}
