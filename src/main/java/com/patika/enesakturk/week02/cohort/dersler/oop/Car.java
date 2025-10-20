package com.patika.enesakturk.week02.cohort.dersler.oop;

public class Car {

    private String brand;
    private String model;
    private int maxSpeed;
    private int horsePower;
    private int maxGearCount = 6;
    private int gear = 0;

    public void move() {
        System.out.println("ileri gidiyoruz.");
    }

    public void incrementGear(int gearCount) {
        if (maxGearCount >= gearCount && gearCount > 0) {
            this.gear = gearCount;
            System.out.println("Vites seviyeniz : " + gearCount);
        } else {
            System.out.println("Maksimum vitesi degerini astiniz. Maksimum vites degeri : 6'dir.");
        }
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
