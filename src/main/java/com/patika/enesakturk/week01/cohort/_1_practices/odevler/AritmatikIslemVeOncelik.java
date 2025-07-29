package com.patika.enesakturk.week01.cohort._1_practices.odevler;

import java.util.Scanner;

public class AritmatikIslemVeOncelik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan üç sayı al ve bu sayilari farklı degiskenlere ata
        System.out.print("Birinci sayıyı girin (a): ");
        int a = scanner.nextInt();

        System.out.print("İkinci sayıyı girin (b): ");
        int b = scanner.nextInt();

        System.out.print("Üçüncü sayıyı girin (c): ");
        int c = scanner.nextInt();

        // İşlem: a + b * c - b
        int sonuc = a + b * c - b;

        // Sonucu yazdır
        System.out.println("Sonuç: " + sonuc);
    }
}
