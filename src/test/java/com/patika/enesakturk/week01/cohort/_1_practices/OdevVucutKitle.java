package com.patika.enesakturk.week01.cohort._1_practices;

import java.util.Scanner;

public class OdevVucutKitle {
    public static void main(String[] args) {
        // Kilo (kg) / Boy(m) * Boy(m)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();

        System.out.print("Lütfen boyunuzu giriniz : ");
        double boy = scanner.nextDouble();

        scanner.close();
        double vucutKitleIndeksi = kilo / ( boy * boy );

                System.out.println("Vücut kitle indeksiniz :  = " + vucutKitleIndeksi);
    }
}
