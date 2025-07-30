package com.patika.enesakturk.week01.cohort._1_practices.dersler;

public class Ternary {
    public static void main(String[] args) {
        String mesaj ="";
        int sayi = 12;

        mesaj = sayi > 10 ? "Sayi 10'dan büyük." :
                sayi > 5 && sayi < 10 ? "sayi 5 ile 10 arasida" :
                        "Sayi 5'den küçüktür.";
        System.out.println(mesaj);
    }
}
