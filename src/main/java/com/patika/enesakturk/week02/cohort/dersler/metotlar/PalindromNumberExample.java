package com.patika.enesakturk.week02.cohort.dersler.metotlar;

import java.util.Scanner;

public class PalindromNumberExample {
    public static void main(String[] args) {

        //Palindrom
        // 121 -> 121 bu sayi palindromdur.
        // 123 -> 321 bu sayi palindrom degildir.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int number = scanner.nextInt();

        boolean isPalindromNumber = isPalindrom(number);

        if (isPalindromNumber)
            System.out.println("sayi polindromdur.");
        else
            System.out.println("Sayi polindrom degildir.");

        for (int i = 1; i < number; i++){
            boolean isPalindromNumber2 = isPalindrom(i);
            if (isPalindromNumber2)
                System.out.println(i + " sayisi polindrom sayidir.");
        }

    }

    public static boolean isPalindrom(int number){
        int originalNumber = number;
        int reverseNumber = 0 ;

        while (number > 0){
            int digit = number % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            number /= 10;
        }
        return originalNumber == reverseNumber;
    }
}
