package com.patika.enesakturk.week01.cohort._1_practices;

import java.util.Scanner;

public class CircleCalculatorExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yari çapini giriniz : ");
        double radius = scanner.nextDouble();

        double pi = 3.14159;
        double area = radius * pi * pi;
        double circumference = 2 * pi * radius;

        double area2 = Math.PI * radius * radius;
        double circumference2 = 2 * Math.PI * radius;

        System.out.println("Dairenin alanlari : " + area + " - " + area2 );
        System.out.println("Dairenin çevreleri : " + circumference + " - " + circumference2 );
    }
}
