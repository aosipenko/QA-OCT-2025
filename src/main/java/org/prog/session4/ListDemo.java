package org.prog.session4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        //0:A
        //1:B
        //2:C
        //3:D
        List<String> aList = new ArrayList<>();
        //[start] - A - B - C - D - [end]
        //[start] - A - B - C - D - [end]
        List<String> bList = new LinkedList<>();

        aList.add("A");
        aList.add("B");
        aList.add("C");
        aList.add("D");
        aList.add("E");
        aList.add("F");

        bList.add("C");
        bList.add("D");
        bList.add("E");
        bList.add("F");

        aList.addAll(bList);
        System.out.println(aList.size());
        System.out.println(aList.containsAll(bList));
    }
}
