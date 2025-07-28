package com.patika.enesakturk.week01.cohort._1_practices;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        int day = 15;

        switch (day) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecersiz bir gün degeri girdiniz.");
        }

        Scanner scanner =new Scanner(System.in);

        System.out.print("1. sayiyi giriniz : ");
        double number1 = scanner.nextDouble();

        System.out.print("2. sayiyi giriniz : ");
        double number2 = scanner.nextDouble();

        System.out.print("Lütfen yapmak istediğiniz işlemi söyleyin: ( +, -, *, / ) : ");
        char operation = scanner.next().charAt(0);

        switch (operation){
            case '+':
                System.out.println("Sayilarin toplami : " + (number1 + number2));
                break;
            case '-':
                System.out.println("Sayilarin farki : " + (number1 - number2));
                break;
            case '*':
                System.out.println("Sayilarin carpimi : " + (number1 * number2));
                break;
            case '/':
                if (number2 != 0)
                    System.out.println("Sayilarin bolumu : " + (number1 / number2));
                else
                    System.out.println("2. sayinin degeri 0 olamaz.");
                break;
            default:
                System.out.println("Gecersiz Islem.");
        }

        int gradu = 85;

       String letterGrade = switch (gradu){
            case 10,9  ->  "A";
            case 8  ->  "A";
            case 7  ->  "A";
            case 5  ->  "A";
            case 3  ->  "A";
            case 0  ->  "A";
            default -> "F";
        };
        System.out.println("Harf notu ve puaniniz : " + letterGrade + " - " + gradu);
    }
}
