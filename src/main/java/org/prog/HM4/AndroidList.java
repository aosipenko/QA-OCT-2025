package org.prog.HM4;

import java.util.ArrayList;
import java.util.List;

import static org.prog.HM4.Random.getRandomColor;
import static org.prog.HM4.Random.getRandomResolution;

public class AndroidList {
    public static void main(String[] args) {
        List<AndroidPhone> androidPhones = new ArrayList<>();
//        androidPhones.add(new AndroidPhone());
//        androidPhones.add(new AndroidPhone());
//
//        androidPhones.get(0).color = "silver";
//        androidPhones.get(0).resolution = "2340x1080";
//
//        androidPhones.get(1).color = "green";
//        androidPhones.get(1).resolution = "3120x1440";

        for(int i = 0; i < 100; i++) {
            AndroidPhone android = new AndroidPhone();
            android.color = getRandomColor();
            android.resolution = getRandomResolution();
            androidPhones.add(android);
        }

        for(AndroidPhone android1 : androidPhones) {
            System.out.println(android1.color + " " + android1.resolution);
        }

    }
}
