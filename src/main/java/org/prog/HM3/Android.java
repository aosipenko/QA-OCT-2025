package org.prog.HM3;

public class Android implements IPhone {

    public void settingsPhone (String screenResolution, String color, String memory) {
        System.out.println("Screen is " + screenResolution + " case is " + color + " memory is " + memory);
    }

    public void settingsPhone(String screenResolution, String color) {
        System.out.println("Screen is " + screenResolution + " case is " + color);
    }

    public void browse() {
        System.out.println("Open browser Chrome");
    }

    public void call() {
        System.out.println("Android can call someone");
    }

    public void unlockScreen() {
        System.out.println("You unlock your Android");
    }
}
