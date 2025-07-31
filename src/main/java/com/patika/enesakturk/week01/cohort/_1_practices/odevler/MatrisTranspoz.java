package com.patika.enesakturk.week01.cohort._1_practices.odevler;

public class MatrisTranspoz {
    public static void main(String[] args) {
        // Orijinal matris (2x3)
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Transpoz matris (3x2)
        int[][] transpoz = new int[matris[0].length][matris.length];

        // Transpoz işlemi: satır ve sütun yer değiştiriyor
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        // Orijinal matrisin yazdırılması
        System.out.println("Orijinal Matris:");
        for (int[] row : matris) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Transpoz matrisin yazdırılması
        System.out.println("\nTranspoz Matris:");
        for (int[] row : transpoz) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}
