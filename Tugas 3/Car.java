package com.simpleracinggame;

class Car {
    final int speed;
    final int handling;
    final int acceleration;
    final String driverName;

    Car(String driverName, int speed, int handling, int acceleration) {
        this.driverName = driverName;
        this.speed = speed;
        this.acceleration = acceleration;
        this.handling = handling;
    }

    void display() {
        System.out.println("Driver:" + this.driverName);
        System.out.println("Speed:" + this.speed + " KM/jam");
        System.out.println("Acceleration" + this.acceleration);
        System.out.println("Handling: " + this.handling);
    }

    int getSpeed() {
        return this.speed;
    }

}

class Lamborghini extends Car {
    final String carName = "Lamborghini";

    Lamborghini(String driverName, int speed, int handling, int acceleration) {
        super(driverName, speed, handling, acceleration);
    }

    @Override
    void display() {
        System.out.println("Car=" + carName);
        super.display();

    }
}

class Ferrari extends Car {
    final String carName = "Ferrari";

    Ferrari(String driverName, int speed, int handling, int acceleration) {
        super(driverName, speed, handling, acceleration);
    }

    void display() {
        System.out.println("Car= " + carName);
        super.display();
    }
}

class Porche extends Car {
    final String carName = "Porche";

    Porche(String driverName, int speed, int handling, int acceleration) {
        super(driverName, speed, handling, acceleration);
    }

    void display() {
        System.out.println("Car= " + carName);
        super.display();
    }
}