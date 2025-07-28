package com.patika.enesakturk.week01.cohort._1_practices;

import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adinizi giriniz : ");
        String name = scanner.nextLine();

        System.out.print("Yaşinizi giriniz : ");
        int age = scanner.nextInt();

        System.out.println("Adiniz : " + name + " ve yaşiniz " + age);
        scanner.close();

    }
}
