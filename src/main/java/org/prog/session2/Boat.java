package org.prog.session2;

public class Boat {

    private String fuelLevel;

    public void sailTo(String portName) {
        fuelLevel = "100";
        System.out.println("Sail to " + portName);
        startEngine();
        raiseAnchor();
        notifyCoastalGuard();
        System.out.println("Start sailing");
    }

    private void startEngine() {
        int fuelLevelUpdate = Integer.parseInt(fuelLevel) - 1;
        fuelLevel = fuelLevelUpdate + "";
        System.out.println("Starting engine. New fuel level " + fuelLevel);
    }

    private void raiseAnchor() {
        System.out.println("Raising anchor");
    }

    private void notifyCoastalGuard() {
        System.out.println("Notifying coastal guard");
    }

}
