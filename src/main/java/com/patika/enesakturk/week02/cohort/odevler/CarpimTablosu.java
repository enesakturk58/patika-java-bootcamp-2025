package com.patika.enesakturk.week02.cohort.odevler;

import java.util.Scanner;

public class CarpimTablosu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        // Geçerli aralıkta sayı gelene kadar sor
        while (true) {
            System.out.print("Üst sınırı giriniz (1-10): ");

            if (!sc.hasNextInt()) {
                System.out.println("Hata: Lütfen tam sayı girin.");
                sc.next(); // geçersiz girdiyi tüket
                continue;
            }

            number = sc.nextInt();
            if (number < 1 || number > 10) {
                System.out.println("Hata: n değeri 1 ile 10 (dahil) arasında olmalıdır.");
                continue;
            }
            break; // geçerli değer alındı
        }


        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++){
                System.out.printf("%-4d", i * j);
            }
            System.out.println();
        }
    }
}
