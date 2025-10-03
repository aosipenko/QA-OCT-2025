package org.prog.session2;

import org.prog.session1.Car;

//TODO: Create Planes inheritance: Biplane > MotorPlane > Jet > Boeing
//TODO:                                                       > Airbus
//TODO: write some methods unique for each class

public class Main {

    /**
     * ####################################
     * #####[Car@myCar.color="red"]<--- alexeysCars, thatCar
     * ####################################
     * ####################################
     * ####################################
     * ####################################
     * ------------------------------------
     * ######1#2###########################
     *
     * @param args
     */

    public static void main(String[] args) {
        Car car = new Car();
        BigCar bigCar = new BigCar();
        Truck truck = new Truck();
        BigTruck bigTruck = new BigTruck();

        car.changeColor("blue");
        car.plateNumber = "AA0000AA";

        bigCar.changeColor("red");
        bigCar.plateNumber = "BB0000AA";

        truck.changeColor("green");
        truck.plateNumber = "CC0000AA";

        bigTruck.changeColor("black");
        bigTruck.plateNumber = "DD0000AA";

        car.goTo("Lviv");
        car.driveThroughCrossroads();

        bigCar.goTo("Odessa");
        bigCar.additionalSmallCargo();
        bigCar.driveThroughCrossroads();

        truck.goTo("Kyiv");
        truck.additionalSmallCargo();
        truck.additionalMediumCargo();
        truck.driveThroughCrossroads();

        bigTruck.goTo("Lviv");
        bigTruck.additionalSmallCargo();
        bigTruck.additionalMediumCargo();
        bigTruck.additionalLargeCargo();
        bigTruck.driveThroughCrossroads();

//        Boat boat = new Boat();
//        boat.sailTo("London");
//        Car myCar = new Car();
//        CarService carService = new CarService();
//        int number1 = 1;
//        int number2 = 10;
//        System.out.println("---------------------------------------");
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println("---------------------------------------");
//        carService.incrementNumber(number1);
//        carService.incrementNumber(number2);
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println("---------------------------------------");
//        carService.incrementNumber2(number1);
//        carService.incrementNumber2(number2);
//        number1 = 50;
//        number2 = 500;
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println("---------------------------------------");
    }
}
