package com.patika.enesakturk.week01.cohort._1_practices;

public class Ifelse {
    public static void main(String[] args) {

        int number = 5;

        if (number > 5){
            System.out.println("Sayi 5'den büyüktür.");
        } else if (number == 5) {
            System.out.println("Sayi 5'e eşittir.");
        }else {
            System.out.println("Sayi 5'den küçüktür.");
        }

        int not = 50;
        char harfNotu ;

        if (not > 85){
            harfNotu = 'A';
        } else if (not > 70) {
            harfNotu = 'B';
        } else if (not > 50) {
            harfNotu = 'C';
        }else {
            harfNotu = 'F';
            System.out.println("Dersi gecemediniz.");
        }
        System.out.println("Harf Notunuz : " + harfNotu);
    }
}
