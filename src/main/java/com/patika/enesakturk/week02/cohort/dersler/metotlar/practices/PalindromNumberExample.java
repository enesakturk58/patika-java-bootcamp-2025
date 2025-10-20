package com.patika.enesakturk.week02.cohort.dersler.metotlar.practices;

// Palindrom
// 121 -> 121 Bu sayi palindromdur.
// 123 -> 123 Bu sayi palindrom degildir.

import java.util.Scanner;

public class PalindromNumberExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir sayi giriniz : ");
        int number = scanner.nextInt();

        boolean isPolindromNumber = isPalindrom(number);

    }

    private static boolean isPalindrom(int number){

        int originalNumber = number;
        int digit = 0;

        while(0 < number){
            

        }

        return true;
    }
}
