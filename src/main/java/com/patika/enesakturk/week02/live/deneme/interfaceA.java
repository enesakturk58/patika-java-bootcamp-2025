package com.patika.enesakturk.week02.live.deneme;

public interface interfaceA {


        default void calistir() {
            System.out.println("Motor calisiyor...");
            guvenlikKontrolu();
        }

        static void durdur() {
            System.out.println("Motor durdu...");
            guvenlikKontrolu();
        }

        private static void guvenlikKontrolu() {
            System.out.println("Güvenlik sistemi aktif.");
        }
    }

