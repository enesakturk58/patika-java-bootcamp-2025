package com.patika.enesakturk.week01.cohort._1_practices.odevler;

import java.util.Scanner;

public class OdevTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Kullanıcıdan Veri Almaya Gereken Komut Satırı-

        // Kullanıcının Giriceği Sayı'nın Komut Satırı-
        System.out.print("Basamak Sayısı Giriniz: ");
        int number = scanner.nextInt();

        // Her Yıldıza Boşlukları Yazdıran Komut Satırı-
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            // Yıldızları Yazdıran Komut Satırı-
            for (int k = 1; k <= 2 * (number - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Yeni Satıra Geçmesini Sağlıyor.
        }
        scanner.close();
    }
    }



