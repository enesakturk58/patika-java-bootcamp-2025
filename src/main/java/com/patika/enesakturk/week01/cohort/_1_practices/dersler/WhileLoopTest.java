package com.patika.enesakturk.week01.cohort._1_practices.dersler;

import java.util.Scanner;

public class WhileLoopTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password ="1234";

        while (true){
            System.out.print("Sifreyi girin : ");

            String input = scanner.nextLine();

            if (password.equals(input)){
                System.out.println("Sifre dogru.");
                break;
            }else {
                System.out.println("Yanlis sifre girdiniz.");
            }

        }
    }
}
