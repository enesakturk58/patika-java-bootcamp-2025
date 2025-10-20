package com.patika.enesakturk.week02.cohort.dersler.oop;

public class CarTest {

    public static void main(String[] args) {

        Car bmw = new Car(); // nesne olusturldu. ( instance )

        bmw.incrementGear(6);

        bmw.setBrand("BMW");
        bmw.setModel("3.20");
        bmw.setMaxSpeed(285);
        bmw.setHorsePower(180);

        bmw.move();

    }
}
