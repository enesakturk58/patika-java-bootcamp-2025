package com.patika.enesakturk.week02.cohort.odevler;

import java.util.Scanner;

public class GecerliSifreKontrolu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Kullanicidan Sifre iste.
        System.out.print("Şifreyi giriniz: ");
        String sifre = scanner.nextLine();

        // Kullanicidan alinan sifrenin gereksinimlerini kontrol edecek degiskenleri tanimla.
        boolean uzunlukKontrol = sifre.length() >= 8;
        boolean boslukKontrol = !sifre.contains(" ");
        boolean ilkHarfKontrol = Character.isUpperCase(sifre.charAt(0));
        boolean soruIsaretiKontrol = sifre.charAt(sifre.length() - 1) == '?';

        // Sifre gereksinimlerinin kontrolu ve
        if (uzunlukKontrol && boslukKontrol && ilkHarfKontrol && soruIsaretiKontrol) {
            System.out.println("Geçerli Şifre");
        } else {
            System.out.println("Geçersiz Şifre");
        }
    }
}
