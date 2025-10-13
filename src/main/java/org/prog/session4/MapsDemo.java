package org.prog.session4;

import org.prog.session3.Mazda;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

    public static void main(String[] args) {
//        Map<String, Mazda> cars = new HashMap<>();
//        cars.put("John", new Mazda());
//        cars.put("Jane", new Mazda());
//        cars.put("Jack", new Mazda());
//        cars.put("Tom", new Mazda());
//        cars.put("Bob", new Mazda());
//
//        System.out.println(cars.get("Bob"));

        Map<String, String> demo1 = new HashMap<>();
        Map<String, String> demo2 = new HashMap<>();

        demo1.put("key 1", "value 1");
        demo1.put("key 2", "value 2");
        demo1.put("key 3", "value 3");

        demo2.put("key 3", "demo - 2 - 1");
        demo2.put("key 4", "demo - 2 - 2");
        demo2.put("key 5", "demo - 2 - 3");

        demo2.putAll(demo1);
        System.out.println(demo1);

    }
}
