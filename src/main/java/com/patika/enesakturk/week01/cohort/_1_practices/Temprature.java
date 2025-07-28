package com.patika.enesakturk.week01.cohort._1_practices;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Celcius türünden sicaklik girin : ");
        double celcius = scanner.nextDouble();

        // F = (celcius*1.8) + 32

        double f = (celcius*1.8) + 32;

        System.out.println("C -> F : " + f);

    }
}
