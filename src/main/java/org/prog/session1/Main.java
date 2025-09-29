package org.prog.session1;

public class Main {

    /**
     * ####################################
     * #####[Car@car1.color="red"]#########
     * ####################################
     * ####################################
     * ####################################
     * ############[Car@car2.color="blue"]#
     * ####################################
     * @param args
     */

    public static void main(String[] args) {
        CarService carService = new CarService();
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        carService.paintCar(car1, "red");
        car1.plateNumber = "AA0011AA";
//        car2.color = "blue";
        carService.paintCar(car2, "blue");
        car2.plateNumber = "TT0022TT";
//        car3.color = "red";
        carService.paintCar(car3, "green");
        car3.plateNumber = "HH1234HH";

        System.out.println(car1.color);
        System.out.println(car2.color);

        car1.goTo("Odessa");
        car2.goTo("Lviv");
        car3.goTo("Dnipro");

        car1.changeColor("green");
        car1.goTo("Odessa");
    }
}
