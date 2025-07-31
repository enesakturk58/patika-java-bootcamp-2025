package com.patika.enesakturk.week01.cohort._1_practices.dersler.arrays;

import java.util.Scanner;

public class MinMaxFinderExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kac elemanli bir dizi istiyorsunuz : ");
        int inputElemanSayisi = scanner.nextInt();

        int[] numbers = new int[inputElemanSayisi];

        for (int i = 0; i < numbers.length ; i++){
            System.out.print( (i + 1) + ". Elemani giriniz : ");
            int inputEleman = scanner.nextInt();
            numbers[i] = inputEleman;
        }
        int index = 0;
        for (int sayilar : numbers){
            index++;
            System.out.println(index + ".elenman = " + sayilar);
        }
    }
}
