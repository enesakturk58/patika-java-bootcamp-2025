package com.patika.enesakturk.week01.cohort._1_practices.odevler;



import java.util.Scanner;

public class OdevManavKasaProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Manavda bulunan ürünlerin isimleri

        String Armut;
        String Elma;
        String Domates;
        String Muz;
        String Patlican;

         // Manavda bulunan ürünlerin kilogram türünden fiyatları
        double ArmutFiyat = 11;
        double ElmaFiyat = 15;
        double DomatesFiyat = 9;
        double MuzFiyat = 30;
        double PatlicanFiyat = 17;

        // alisveris öncesi tutar.
        double hesap = 0;

        // Kullanicidan manavdan aldiklarini hesaplayip hesap degiskenine ekliyorum.

        System.out.print("Kaç kilo Armut aldiniz : ");
        double Armutkilo = scanner.nextDouble();
        hesap = Armutkilo*ArmutFiyat;

        System.out.print("Kaç kilo Elma aldiniz : ");
        double ElmaKilo = scanner.nextDouble();
        hesap += (ElmaKilo*ElmaFiyat);

        System.out.print("Kaç kilo Muz aldiniz : ");
        double MuzKilo = scanner.nextDouble();
        hesap += (MuzKilo*MuzFiyat);

        System.out.print("Kaç kilo Domates aldiniz : ");
        double DomatesKilo = scanner.nextDouble();
        hesap += (DomatesKilo*DomatesFiyat);

        System.out.print("Kaç kilo Patlican aldiniz : ");
        double PatlicanKilo = scanner.nextDouble();
        hesap += (PatlicanKilo*PatlicanFiyat);

        // Son tutari yazdiriyorum.
        System.out.println("Hesap = " + hesap);
    }
}
