package com.patika.enesakturk.week01.cohort._1_practices.dersler.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayExample {
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

        Arrays.sort(numbers);

        for (int sayi : numbers){
            System.out.println("sayi = " + sayi);
        }
    }
}
