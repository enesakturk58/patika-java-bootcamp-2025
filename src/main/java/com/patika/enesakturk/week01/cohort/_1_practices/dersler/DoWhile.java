package com.patika.enesakturk.week01.cohort._1_practices.dersler;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        boolean isTrue = 1 < 0 ;

        do {
            System.out.println("En az bir kere calisir.");
        }while (isTrue);

        Scanner scanner = new Scanner(System.in);

        String password = "1234";
        boolean passwordIsTrue = true;
        int counter = 0;
        do {
            System.out.println("Lutfen sifrenizi giriniz.");
            String input =scanner.nextLine();

           if( passwordIsTrue == password.equals(input))  {
               System.out.println("Sifre dogru.");
               passwordIsTrue = false;
           }else if (counter==1){
               System.out.println("Son hakkiniz.");
           }else
               System.out.println("Hatali şifre.");
           counter++;

        }while (passwordIsTrue && (counter < 3));

    }
}
