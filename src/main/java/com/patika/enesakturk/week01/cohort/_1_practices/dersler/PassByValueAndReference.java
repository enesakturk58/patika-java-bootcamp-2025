package com.patika.enesakturk.week01.cohort._1_practices.dersler;

public class PassByValueAndReference {

    int y ;

    public static void main(String[] args) {
        int x = 5;
        int[] z = {111,222,333,444};

        PassByValueAndReference passByValueAndReference = new PassByValueAndReference();

        System.out.println("Degistir metodu oncesi : ");
        System.out.println("x = " + x);
        System.out.println("z[0] = " + z[0]);
        System.out.println("passByValueAndReference.y = " + passByValueAndReference.y);

        passByValueAndReference.y= 1;
        degistir(x);
        degistir(z[0]);
        degistir(passByValueAndReference.y);

        System.out.println("Degistir metodu sonrasi : ");
        System.out.println("x = " + x);
        System.out.println("z[0] = " + z[0]);
        System.out.println("passByValueAndReference.y = " + passByValueAndReference.y);

        System.out.println("parametresi sinif olan metot kullanimi sonrasi");
        degistir2(passByValueAndReference);
        System.out.println("passByValueAndReference = " + passByValueAndReference.y);
    }

    static void degistir(int x ){
        x += (-1000);
    }
    static void degistir2(PassByValueAndReference x){
        x.y = x.y + 123;
    }
}
