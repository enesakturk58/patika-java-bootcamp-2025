package com.patika.enesakturk.week02.cohort.dersler.java101;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*

        yyyy = yil (2025)
        MM = ay (12)
        dd = gun (31)
        E = gun kisaltma (Tue)
        EEEE = gun tam adi ( Tuesday )
        H = saat (0-23) (10)
        m = dakika (59)
        s = saniye (59)

        */

public class DateAPIFormatingMain {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDateTime todayTime = LocalDateTime.now();


        System.out.println("today = " + today);

        /*
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
        System.out.println("today.format(dateTimeFormatter) = " + today.format(DateTimeFormatter.ofPattern
                ("dd**MM**yyyy,,H,,mm,s")));
        */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd**MM**yyyy,,H,,mm,s");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd**MM**yyyy");

        System.out.println("today.format(formatter) = " + todayTime.format(formatter)); // Zaman içeriyorsa
        System.out.println("today.format(formatter1) = " + today.format(formatter1));  // sadece tarih
        System.out.println();

        // String'i date objesine donusturme.

        String stringDate ="25/01/2026";

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("LocalDate.parse(stringDate) = " + LocalDate.parse(stringDate,formatter3));

        LocalDate localDate = LocalDate.parse(stringDate,formatter3);

        System.out.println("\"Ileri tarih : \" + localDate = " + "Ileri tarih : " + localDate);

        System.out.println("LocalDate.parse(\"2025-11-21\") = " + LocalDate.parse("2025-11-21"));
        System.out.println("localDate = " + localDate); // ISO_LOCAL_DATE formatinda geri verir.

        LocalDateTime now = LocalDateTime.now();
        System.out.println();

        System.out.println("now = " + now);

        System.out.println("now.format(DateTimeFormatter.ofPattern(\"dd-MM-yyyy HH:mm:ss\")) = "
                + now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        System.out.println();

        System.out.println("now.format(DateTimeFormatter.ofPattern(\"dd-MM-yyyy HH:mm\")) = "
                + now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
        System.out.println();

        String stringDateTime = "25-02-2027 16:05:55";

        System.out.println("LocalDateTime.parse(\"dd-MM-yyyy HH:mm:ss\") = "
                + LocalDateTime.parse(stringDateTime, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        System.out.println();

        // baska bir ulkenin zaman dilimine gecmek
        LocalDateTime localDateTime = ZonedDateTime.now(ZoneId.of("Australia/Sydney")).toLocalDateTime();
        System.out.println(" Avustralya localDateTime = " + localDateTime);

        System.out.println("Turkiye LocalDate.now() = " + LocalDateTime.now());


    }
}
