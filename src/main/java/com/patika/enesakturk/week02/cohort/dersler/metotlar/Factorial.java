package com.patika.enesakturk.week02.cohort.dersler.metotlar;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("factorial(5) = " + factorial(5));
    }

    //Recursive Method
    public  static int factorial(int sayi){

        // Kosul koymazsan sonsuz dönguye girer ve stackOverflowError hatasi alirsin.

            if (sayi == 0)
                return 1;

        return sayi*factorial(sayi-1);
    }



}
