package com.patika.enesakturk.week01.cohort._1_practices.dersler.statics;

public class main {
    public static void main(String[] args) {

        // bir classtan nesne üretmeden, static ile

       // Ogrenci ogrenci = new Ogrenci();
        Ogrenci.numara="12334";
        System.out.println("numara = " + Ogrenci.numara);

        System.out.println("Math static sinifindan deger alma PI :" + Math.PI);

    }
}