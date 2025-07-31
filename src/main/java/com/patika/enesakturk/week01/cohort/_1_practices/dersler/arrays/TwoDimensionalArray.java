package com.patika.enesakturk.week01.cohort._1_practices.dersler.arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int [][] matris = new int[2][3];

        matris[0][0] = 1;
        matris[0][1] = 2;
        matris[0][2] = 3;

        matris[1][0] = 4;
        matris[1][1] = 5;
        matris[1][2] = 6;

        for (int i = 0; i < matris.length ; i++){
                for (int j = 0; j < matris[i].length ; j++){
                    System.out.print(matris[i][j] + " - ");
                }
            System.out.println();
        }







    }
}
