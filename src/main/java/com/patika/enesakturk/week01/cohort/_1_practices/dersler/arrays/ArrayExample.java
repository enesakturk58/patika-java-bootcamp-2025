package com.patika.enesakturk.week01.cohort._1_practices.dersler.arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int[] sayilar = {1,23,3,14,123,1,452,312,5,141,23,0};
        int max = sayilar[0];

        for (int sayi : sayilar){
            if (max < sayi)
                max = sayi;
        }
        System.out.println("En buyuk sayi : " + max );
    }
}
