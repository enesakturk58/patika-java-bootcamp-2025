package com.patika.enesakturk.week01.cohort._1_practices.odevler;

import java.util.Scanner;

public class TipDonusum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan tam sayı al
        System.out.print("Bir tam sayı giriniz (int): ");
        int tamSayi = scanner.nextInt();

        // Kullanıcıdan ondalıklı sayı al
        System.out.print("Bir ondalıklı sayı giriniz (double): ");
        double ondalikliSayi = scanner.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştür
        double tamdanDouble = (double) tamSayi;

        // Ondalıklı sayıyı tam sayıya dönüştür
        int doubledanInt = (int) ondalikliSayi;

        // Sonuçları yazdır
        System.out.println("\n--- Dönüşüm Sonuçları ---");
        System.out.println("Tam sayı (int): " + tamSayi);
        System.out.println("Ondalıklı sayı (double): " + ondalikliSayi);

        System.out.println("Tam sayıdan double'a dönüşüm sonucu: " + tamdanDouble);
        System.out.println("Double sayıdan int'e dönüşüm sonucu: " + doubledanInt);
    }
}
