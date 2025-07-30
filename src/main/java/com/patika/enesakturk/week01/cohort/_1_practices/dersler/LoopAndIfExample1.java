package com.patika.enesakturk.week01.cohort._1_practices.dersler;

import java.util.Scanner;

public class LoopAndIfExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int number = scanner.nextInt();

        if(number > 0){
            System.out.println("Bu sayi pozitiftir. Sayi = " + number);
        } else if (number < 0) {
            System.out.println("Bu sayi negatiftir. Sayi = " + number);
        }else {
            System.out.println("Bu sayi 0'a esit bir sayidir.");
        }

        System.out.println("Lütfen faktoriylini hesaplamak istediginiz sayiyi giriniz : ");
        int faktoriyeliIstenilenSayi = scanner.nextInt();
        int result = 1;

        if (faktoriyeliIstenilenSayi > 0){
            for (int i = 1; i<=faktoriyeliIstenilenSayi; i++){
                result *= i;
            }
        } else if (faktoriyeliIstenilenSayi < 0) {
            System.out.println("Hatali veri girdiniz.");
        }else if (faktoriyeliIstenilenSayi == 0){
            System.out.println("Sayiniz 0. Bu yuzden sonuc : 1");
        }  else {
            System.out.println("Hatali islem");
        }
        System.out.println(faktoriyeliIstenilenSayi + "! = " + result);



    }
}
