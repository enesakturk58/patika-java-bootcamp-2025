package com.patika.enesakturk.week02.cohort.dersler.metotlar.practices;

import java.util.Scanner;

public class PowerNumberExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban degerini giriniz : ");
        int base = scanner.nextInt();

        System.out.print("Us degerini giriniz : ");
        int power =scanner.nextInt();

        int result = powerMethot(base,power);

        System.out.println(base + " ^" + power + " = " + result);
    }
    private static int powerMethot(int base, int power ) {

        int result = 1;

        if (base == 0 && power == 0){
            System.out.println("sayi tanimsizdir.");
            return 0;
        }
        else if (base == 0) {
            return 0;
        }
        else if (power>0) {
            for (int i = 0; i < power ; i++){
                    result *=base;
            }
                  return result;
        }

        return result;
    }
}
