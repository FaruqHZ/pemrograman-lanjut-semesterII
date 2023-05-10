package com.simpleracinggame;

public class Main {
    public static void main(String[] args) {
        Lamborghini Lamborghini1 = new Lamborghini("Faruq", 280, 50, 60);
        Ferrari Ferrari1 = new Ferrari("Hafidz", 290, 65, 49);
        Porche Porsche1 = new Porche("Surya", 299, 40, 90);

        Lamborghini1.display();
        Ferrari1.display();
        Porsche1.display();

        Car car1 = new Car ("Sumbul", 222,22,222);

        System.out.println(car1.driverName);

    }
}
