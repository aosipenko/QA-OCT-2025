package org.prog.HM2;

public class Plane {
    String model;

    public String getModel() {
        return model;
    }

    public static void main(String[] args) {

    Biplane biplane = new Biplane();
    MotorPlane motorPlane = new MotorPlane();
    Jet jet = new Jet();
    Boeing boeing = new Boeing();
    Airbus airbus = new Airbus();

    biplane.flyTo("Lviv");
    motorPlane.flyTo("Kyiv");
    jet.flyTo("Madrid");
    boeing.flyTo("Rome");
    airbus.flyTo("New York");

    biplane.capacitySmall("1");
    motorPlane.capacitySmall("2");
    jet.capacitySmall("4");
    jet.capacityMedium("15");
    airbus.capacitySmall("6");
    airbus.capacityMedium("47");
    airbus.capacityLarge("140");
    boeing.capacitySmall("5");
    boeing.capacityMedium("30");
    boeing.capacityExtraLarge("360");

    boeing.autopilot();

    }
}
