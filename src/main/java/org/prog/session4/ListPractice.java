package org.prog.session4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TODO: Create List<Android> and List<IOS>
//TODO: Add 2 phones to each list
//TODO: Set resolution and colro for each phone in each list
//TODO *: Add methods that will generate color and resolution at random
//TODO *: Use them to fill phone details
//TODO **: make this work for 100 phones for each type

public class ListPractice {

    public static void main(String[] args) {
        List<Motorcycle> list = new ArrayList<>();
        list.add(new Motorcycle());

        Motorcycle m1 = list.get(0);
        m1.color = "red";
        m1.plateNumber = "12345";

        list.get(0).color = "blue";
        list.get(0).plateNumber = "654321";

        for (Motorcycle moto : list) {
            System.out.println(moto.color + " " + moto.plateNumber);
        }
    }

    public static String randomColor(){
        Random rand = new Random();
        int i = rand.nextInt(5);
        if (i == 0){
            return "red";
        }
        if (i == 1){
            return "blue";
        }
        return "yellow";
    }
}