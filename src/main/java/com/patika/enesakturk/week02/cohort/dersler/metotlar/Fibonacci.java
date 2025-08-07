package com.patika.enesakturk.week02.cohort.dersler.metotlar;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("fibonacci(5) = " + fibonacci(6));

    }

    // Fibonacci mantigi = 0,1,1,2,3,5,8,13,21.....

    public static int fibonacci(int sayi){

        if(sayi == 0)
            return 0;
        else if (sayi == 1)
            return 1;
        else
            return fibonacci(sayi-1) + fibonacci(sayi-2);
    }
}
