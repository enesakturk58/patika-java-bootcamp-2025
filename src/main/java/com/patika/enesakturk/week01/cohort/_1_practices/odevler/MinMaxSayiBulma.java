package com.patika.enesakturk.week01.cohort._1_practices.odevler;

import java.util.Scanner;

public class MinMaxSayiBulma {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi oluşturulur

    System.out.print("Kaç tane sayı gireceksiniz: ");
    int n = scanner.nextInt(); // Kullanıcıdan kaç sayı gireceğini alırız

    // Negatif ya da sıfır sayıda giriş anlamsızdır, bu yüzden kontrol edilir
    if (n <= 0) {
        System.out.println("Lütfen pozitif bir sayı giriniz.");
        return; // Programı sonlandır
    }

    // İlk sayıyı kullanıcıdan alırız ve hem en küçük (min) hem de en büyük (max) sayı olarak kabul ederiz
    System.out.print("1. Sayıyı giriniz: ");
    int number = scanner.nextInt();

    int max = number; // Şimdilik en büyük sayı bu
    int min = number; // Şimdilik en küçük sayı da bu

    // Kalan n-1 adet sayıyı kullanıcıdan alırız
    for (int i = 2; i <= n; i++) {
        System.out.print(i + ". Sayıyı giriniz: ");
        number = scanner.nextInt(); // Yeni sayı girilir

        // Girilen sayı mevcut en büyükten büyükse, en büyük güncellenir
        if (number > max) {
            max = number;
        }

        // Girilen sayı mevcut en küçükten küçükse, en küçük güncellenir
        if (number < min) {
            min = number;
        }
    }

    // Döngü bittikten sonra sonuçlar ekrana yazdırılır
    System.out.println("En büyük sayı: " + max);
    System.out.println("En küçük sayı: " + min);

    scanner.close(); // Scanner kaynağını kapatmak iyi bir alışkanlıktır
}
}
