package org.prog.HM4;

import org.prog.session4.Motorcycle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.prog.HM4.Random.getRandomColor;
import static org.prog.HM4.Random.getRandomResolution;

public class IOSList {
    public static void main(String[] args) {
        List<IOSPhone> iosList = new ArrayList<>();
//        iosList.add(new IOSPhone());
//        iosList.add(new IOSPhone());

//        iosList.get(0).color = "orange";
//        iosList.get(0).resolution = "2622x1206";
//
//        iosList.get(1).color = "blue";
//        iosList.get(1).resolution = "2340x1080";

        for (int i = 0; i < 100; i++) {
            IOSPhone phone1 = new IOSPhone();
            phone1.color = getRandomColor();
            phone1.resolution = getRandomResolution();
            iosList.add(phone1);
        }

        for (IOSPhone iosPhone : iosList) {
            System.out.println(iosPhone.color + " " + iosPhone.resolution);
        }

    }

}
