package com.patika.enesakturk.week01.cohort._1_practices.odevler;

import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {
    /*
    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
    Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
     Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın
      ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !"
şeklinde bir uyarı verilmelidir.

Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.


     */
    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);

        System.out.print("Gitmek istediginiz mesafe kaç km ? : ");
        double km = scanner.nextDouble();

        System.out.print("Yasiniz ? : ");
        int yas = scanner.nextInt();

        System.out.println("Yolculuk tipi (Tek Yön için = 1 , Gidiş-Dönüş için = 2) : ");
        int yolculukTipi = scanner.nextInt();

        if (yolculukTipi == 1 || yolculukTipi == 2){
            double fiyat = km/10;

            if (yas<12)
                fiyat/=2;
            else if (yas <= 24 && yas >= 12)
                fiyat*=0.9;
            else if (yas>65)
                fiyat*=0.7;

            if (yolculukTipi == 2 )
                fiyat*=0.8;

            System.out.println("Bilet fiyatiniz : " + fiyat);

        }else
            System.out.println("Hatali Veri Girdiniz !");

    }
}
