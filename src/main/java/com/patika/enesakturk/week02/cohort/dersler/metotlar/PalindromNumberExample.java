package com.patika.enesakturk.week02.cohort.dersler.metotlar;

import java.util.Scanner;

public class PalindromNumberExample {
    public static void main(String[] args) {

        //Palindrom
        // 121 -> 121 bu sayi palindromdur.
        // 123 -> 321 bu sayi palindrom degildir.

       // Scanner scanner = new Scanner(System.in);
       // System.out.print("Lutfen bir sayi giriniz : ");
       // int number = scanner.nextInt();

        for (int i = 0; i < 1000; i++){
            boolean isPolindromNumber = isPolindrom(i);

            if (isPolindromNumber) {
                System.out.println(i + " sayisi polindromdur.");
            }

        }

    }

    private static boolean isPolindrom(int number){

        int originalNumber = number;
        int reverseNumber = 0;

        while(number > 0){
            int digit = number % 10;
            reverseNumber = (reverseNumber*10) + digit;
            number /= 10;
        }

        return originalNumber == reverseNumber;
    }
}
