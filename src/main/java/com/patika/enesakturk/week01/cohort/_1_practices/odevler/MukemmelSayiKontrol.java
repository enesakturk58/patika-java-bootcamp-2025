package com.patika.enesakturk.week01.cohort._1_practices.odevler;

import java.util.Scanner;

public class MukemmelSayiKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan girdi almak için

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt(); // Girilen sayıyı al

        int sum = 0; // Bölenlerin toplamını tutmak için değişken

        // 1'den girilen sayıdan bir eksik olana kadar tüm sayıları dolaş
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Eğer i sayısı number'ın böleni ise
                sum += i; // Toplama ekle
            }
        }

        // Bölenler toplamı, sayının kendisine eşitse mükemmel sayıdır
        if (sum == number && number != 0) {
            System.out.println(number + " mükemmel sayıdır.");
        } else {
            System.out.println(number + " mükemmel sayı değildir.");
        }

        scanner.close(); // Kaynağı serbest bırakmak iyi alışkanlıktır
    }
}
