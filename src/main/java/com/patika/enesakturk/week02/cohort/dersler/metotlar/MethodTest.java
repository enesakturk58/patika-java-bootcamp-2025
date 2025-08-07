package com.patika.enesakturk.week02.cohort.dersler.metotlar;

public class MethodTest {
    public static void main(String[] args) {

        toplaVoid(5,7);
        System.out.println();

        double sum = toplaDouble(1.23,5.13214);
        System.out.println("sum = " + sum);
        System.out.println();

    }

    private static void toplaVoid(int sayi1, int sayi2){
        int toplam = sayi1 + sayi2;
        System.out.println("Toplam = " + toplam);
    }

    public static double toplaDouble(double sayi1, double sayi2){
        double toplam = sayi1 + sayi2;
        // return sayi1 + sayi2;
        return toplam;
    }

}
