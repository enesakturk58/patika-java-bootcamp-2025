package com.patika.enesakturk.week01.cohort._1_practices.odevler;

import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan satır sayısı alınır
        System.out.print("Satır sayısını giriniz: ");
        int satirSayisi = scanner.nextInt();

        // Yıldız sayısı başlangıçta (2 * satirSayisi - 1)
        int yildizSayisi = 2 * satirSayisi - 1;

        // Her satır için
        for (int i = 0; i < satirSayisi; i++) {

            // Satırdaki yıldızları yazdır
            for (int j = 0; j < yildizSayisi - (2 * i); j++) {
                System.out.print("*");
            }

            // Satır sonu
            System.out.println();
        }
        scanner.close();
    }
}
