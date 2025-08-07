package com.patika.enesakturk.week02.cohort.dersler.java101;

public class MathAPIMain {
    public static void main(String[] args) {

        double a = 5.50;
        double b = -9.120;

        System.out.println("Math.min(a,b) = " + Math.min(a, b)); // en kucuk deger bulma
        System.out.println("Math.max(a,b) = " + Math.max(a, b)); // en buyuk deger bulma
        System.out.println("Math.round(123.45) = " + Math.round(123.45));
        System.out.println("Math.round(123.50) = " + Math.round(123.50)); // yuvarlama
        System.out.println("Math.ceil(a) = " + Math.ceil(a)); // yukari yuvarlar.
        System.out.println("Math.floor(b) = " + Math.floor(b)); // asagi yuvarlar.
        System.out.println("Math.pow(2,3) = " + Math.pow(2, 3)); // üs alma
        System.out.println("Math.random() = " + Math.random()); // 0.0 ile 1.0 arasinda random sayi üretme

        int rastgeleBirSayi = (int) (Math.random()*10); // 10'a kadar rastgele sayi üretir.
        System.out.println("rastgeleBirSayi = " + rastgeleBirSayi);

    }
}
