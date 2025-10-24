package org.prog.HM3;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        iOS ios = new iOS();
        Android android = new Android();
        usePhone(ios);
        usePhone(android);

        android.settingsPhone("2340x1080", "Black", "512");
        android.settingsPhone("3120x1440", "White");
        ios.settingsPhone("2622x1206", "Orange", "256");
        ios.settingsPhone("2622x1206", "Silver");

        System.out.println(ios.hashCode());
        System.out.println(android.hashCode());
        System.out.println(ios.equals(null));
        System.out.println(android.equals(ios));

    }
        public static void usePhone(IPhone iPhone) {
            iPhone.call();
            iPhone.browse();
            iPhone.unlockScreen();
        }
}
