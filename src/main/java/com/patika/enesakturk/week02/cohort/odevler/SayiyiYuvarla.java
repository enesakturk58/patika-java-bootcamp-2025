package com.patika.enesakturk.week02.cohort.odevler;

import java.util.Scanner;

public class SayiyiYuvarla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan veri almak için Scanner sınıfı

        System.out.print("Ondalıklı bir sayı girin: ");
        double sayi = scanner.nextDouble(); // Kullanıcının girdiği ondalıklı sayı

        // Aşağı yuvarlama: Sayıyı bir altındaki tam sayıya yuvarlar (örn. 5.7 → 5)
        int asagiYuvarla = (int) Math.floor(sayi);

        // Yukarı yuvarlama: Sayıyı bir üstündeki tam sayıya yuvarlar (örn. 5.1 → 6)
        int yukariYuvarla = (int) Math.ceil(sayi);

        // En yakın tam sayıya yuvarlama (örn. 5.7 → 6, 5.4 → 5)
        int enYakin = (int) Math.round(sayi);

        // Sonuçları ekrana yazdır
        System.out.println("Aşağı Yuvarlama: " + asagiYuvarla);
        System.out.println("Yukarı Yuvarlama: " + yukariYuvarla);
        System.out.println("En Yakın Tam Sayı: " + enYakin);
    }
}

