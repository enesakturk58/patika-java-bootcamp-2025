package com.patika.enesakturk.week01.cohort._1_practices.dersler.arrays;

import java.util.Scanner;

public class MatrixExampleArray {
    public static void main(String[] args) {

        int[][] matris ={
                {1,2,3},
                {4,5,6},
                {7,3,9}
        };

        int sum = 0;

        for (int i = 0; i < matris.length ; i++){
            for (int j = 0; j < matris[i].length ; j++){
                if (i == j)
                    sum+=matris[i][j];
            }
        }

        System.out.println("sum = " + sum);

        System.out.print("Matris icerisinde aranacak sayiyi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();;

        for (int i = 0; i < matris.length ; i++) {

            for (int j = 0; j < matris[i].length; j++) {

                if (input == matris[i][j]) {
                    System.out.println("Sayiniz bulundu. Matris[" + i + "][" + j + "]");
                    break;
                } /*
                else {
                    System.out.println("Matrisin icerisinde boyle bir sayi yok.");
                }

                */
            }
        }
    }
}
