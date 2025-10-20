package org.prog.HM4;

public class Random {
    public static String getRandomColor() {
        String[] colors = {"black", "white", "blue", "red", "gold", "orange", "green", "purple"};
        java.util.Random random = new java.util.Random();
        return colors[random.nextInt(colors.length)];
    }

    public static String getRandomResolution() {
        String[] resolutions = {
                "2340x1080", "2532x1170", "2796x1290", "2622x1206", "2556x1179", "3088x1440"
        };
        java.util.Random random = new java.util.Random();
        return resolutions[random.nextInt(resolutions.length)];
    }
}
