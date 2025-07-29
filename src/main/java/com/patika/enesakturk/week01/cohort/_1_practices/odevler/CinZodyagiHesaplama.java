package com.patika.enesakturk.week01.cohort._1_practices.odevler;

import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dogum Yilinizi Giriniz : ");
        int dogumYili = scanner.nextInt();

        int kalan = dogumYili % 12;

        // iki alternatif yöntem hazirladim. switch case ve array.

        System.out.println("Switch-case ;");
        switch (kalan) {
            case 0: System.out.println("Cin Zodyagi Burcunuz : Maymun"); break;
            case 1: System.out.println("Cin Zodyagi Burcunuz : Horoz"); break;
            case 2: System.out.println("Cin Zodyagi Burcunuz : Köpek"); break;
            case 3: System.out.println("Cin Zodyagi Burcunuz : Domuz"); break;
            case 4: System.out.println("Cin Zodyagi Burcunuz : Fare"); break;
            case 5: System.out.println("Cin Zodyagi Burcunuz : Öküz"); break;
            case 6: System.out.println("Cin Zodyagi Burcunuz : Kaplan"); break;
            case 7: System.out.println("Cin Zodyagi Burcunuz : Tavşan"); break;
            case 8: System.out.println("Cin Zodyagi Burcunuz : Ejderha"); break;
            case 9: System.out.println("Cin Zodyagi Burcunuz : Yılan"); break;
            case 10: System.out.println("Cin Zodyagi Burcunuz : At"); break;
            case 11: System.out.println("Cin Zodyagi Burcunuz : Koyun"); break;
            default:
                System.out.println("Hatali bir islem yaptiniz..!");
        }

        System.out.println("Dizi ( Array ) ;");

        // Bu algoritma da Dizi kullanmak daha temiz ve daha okunabilir bir yoldur.

        // Dizi olusturuldu.
        String[] zodyaklar = {
                "Maymun", "Horoz", "Köpek", "Domuz",
                "Fare", "Öküz", "Kaplan", "Tavşan",
                "Ejderha", "Yılan", "At", "Koyun"
        };

        // Burc degeri, istenilen kalan degerini zodyaklar listesinden alıyor.
        String burc = zodyaklar[kalan];
        System.out.println("Çin Zodyağı Burcunuz: " + burc);
    }

}

