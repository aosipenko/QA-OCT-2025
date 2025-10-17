package org.prog.session5;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        System.out.println(list.size());
        Set<String> set = new HashSet<>();
        set.add("set element 1");
        set.add("set element 2");
        set.add("set element 3");
        set.add("set element 4");
        set.add("set element 5");
        System.out.println(set.size());
//        for (String s : set) {
//            System.out.println(s);
//        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
