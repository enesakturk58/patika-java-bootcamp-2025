package com.patika.enesakturk.week02.cohort.dersler.java101;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAPIMain {
    public static void main(String[] args) {

        System.out.println("LocalDate.now() = " + LocalDate.now());
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());

        System.out.println();

        System.out.println("LocalDate.now().plusDays(30) = " + LocalDate.now().plusDays(30));
        System.out.println("LocalDate.now().getMonth(3) = " + LocalDate.now().plusMonths(3));
        System.out.println("LocalDate.now().plusYears(2) = " + LocalDate.now().plusYears(2));

        System.out.println();

        // Kendi tarihimizi olusturmak.
        var date = LocalDate.of(2027,03,11);
        System.out.println("date = " + date);

        // tarihden x gün/ay/yil days/months/years önce.
        System.out.println("LocalDate.now().minusDays(5) = " + LocalDate.now().minusDays(5));

        var date2 = LocalDate.of(2025,8,1);

        // Gun karsilastirma

        boolean isBefore = date2.isBefore(LocalDate.now());
        if (isBefore){
            System.out.println("Uyeliginizin suresi bitmistir.");
        }else
            System.out.println("Uyeliginiz devam etmektedir.");

        // Tarihlerin esitligini kontrol etme
        boolean after = date2.plusMonths(5).isAfter(LocalDate.now());

        System.out.println();
        System.out.println("after = " + after);



    }
}
