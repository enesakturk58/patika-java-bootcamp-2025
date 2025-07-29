package com.patika.enesakturk.week01.cohort._1_practices.odevler;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanicidan dogum yili verisi aliniyor ve yil degiskenine ataniyor.
        System.out.print("Yıl giriniz: ");
        int yil = scanner.nextInt();

        // Artik yil için gerekli sartlar kontrol edilip çikti aliniyor.
        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}
