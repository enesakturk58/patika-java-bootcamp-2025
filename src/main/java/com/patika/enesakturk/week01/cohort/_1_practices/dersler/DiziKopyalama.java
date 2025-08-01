package com.patika.enesakturk.week01.cohort._1_practices.dersler;

public class DiziKopyalama {
    public static void main(String[] args) {

        int[] dizi1 = {0,1,2,3,4,5,6,7};
        int[] dizi2 = new int[dizi1.length];
        int[] dizi3 = new int[10];

        System.arraycopy(dizi1,0,dizi2,0,dizi1.length);
        System.arraycopy(dizi1,1,dizi3,4,4);

        for (int sayi : dizi3){
            System.out.println("sayi = " + sayi);
        }

        /*
        Örnek 1: System.arraycopy() kullanımı

int[] source = {1, 2, 3, 4, 5};
int[] destination = new int[5];
System.arraycopy(source, 0, destination, 0, source.length);
Bu kod parçacığı, 'source' adlı bir diziyi 'destination' adlı bir diziye kopyalar.

Örnek 2: clone() kullanımı

int[] original = {1, 2, 3, 4, 5};
int[] copy = original.clone();
Bu kod parçacığı, 'original' adlı bir diziyi 'copy' adlı bir diziye kopyalar.

Örnek 3: Arrays.copyOf() kullanımı

int[] original = {1, 2, 3, 4, 5};
int[] copy = Arrays.copyOf(original, original.length);
Bu kod parçacığı, 'original' adlı bir diziyi 'copy' adlı bir diziye kopyalar.

Örnek 4: Arrays.copyOfRange() kullanımı

int[] original = {1, 2, 3, 4, 5};
int[] copy = Arrays.copyOfRange(original, 1, 3);
Bu kod parçacığı, 'original' adlı bir dizinin belirli bir bölümünü (1. indeksten 3. indekse kadar)
 'copy' adlı bir diziye kopyalar.

Örnek 5: Dizinin belirli bir bölümünü kopyalama

int[] source = {1, 2, 3, 4, 5};
int[] destination = new int[2];
System.arraycopy(source, 1, destination, 0, 2);
Bu kod parçacığı, 'source' adlı bir dizinin belirli bir bölümünü (1. indeksten itibaren 2 eleman)
'destination' adlı bir diziye kopyalar.

Örnek 6: Büyük bir dizinin belirli bir bölümünü kopyalama

int[] source = new int[1000];
int[] destination = new int[500];
System.arraycopy(source, 250, destination, 0, 500);
Bu kod parçacığı, 'source' adlı büyük bir dizinin belirli bir bölümünü (250. indeksten itibaren 500 eleman)
 'destination' adlı bir diziye kopyalar.

Örnek 7: Kopyalama işleminin sonuçlarını kontrol etme

int[] original = {1, 2, 3, 4, 5};
int[] copy = original.clone();

for (int i = 0; i < copy.length; i++) {
    System.out.println(copy[i]);
}
Bu kod parçacığı, kopyalama işlemi sonrasında 'copy' adlı dizideki tüm elemanları yazdırır.

Örnek 8: Kopyalama işleminin sonuçlarını kontrol etme (2)

int[] original = {1, 2, 3, 4, 5};
int[] copy = Arrays.copyOfRange(original, 1, 3);

for (int i = 0; i < copy.length; i++) {
    System.out.println(copy[i]);
}
Bu kod parçacığı, kopyalama işlemi sonrasında 'copy' adlı dizideki tüm elemanları yazdırır.

Örnek 9: Dizinin belirli bir bölümünü başka bir dizinin belirli bir konumuna kopyalama

int[] source = {1, 2, 3, 4, 5};
int[] destination = {6, 7, 8, 9, 10};
System.arraycopy(source, 1, destination, 2, 2);
Bu kod parçacığı, 'source' adlı bir dizinin belirli bir bölümünü (1. indeksten itibaren 2 eleman)
 'destination' adlı bir dizinin belirli bir konumuna (2. indeks) kopyalar.

Örnek 10: Kendi kopyalama metodumuzu yazma

public static int[] copyArray(int[] source) {
    int[] copy = new int[source.length];
    for (int i = 0; i < source.length; i++) {
        copy[i] = source[i];
    }
    return copy;
}
Bu kod parçacığı, bir dizi kopyalama metodunu tanımlar. Bu metod, parametre olarak verilen
 'source' adlı diziyi kopyalar ve kopyayı geri döndürür.

Örnek 11: Diziyi tersten kopyalama

Java'da bir diziyi tersten kopyalamak için aşağıdaki gibi bir kod yazabiliriz:

int[] original = {1, 2, 3, 4, 5};
int[] reverse = new int[original.length];

for (int i = 0; i < original.length; i++) {
    reverse[i] = original[original.length - 1 - i];
}

// reverse dizisi şimdi {5, 4, 3, 2, 1} şeklinde olacaktır.
Bu kod parçacığı, 'original' adlı dizinin elemanlarını tersten 'reverse' adlı diziye kopyalar.

Örnek 12: Diziyi başka bir diziye kopyalama ve kopyanın elemanlarını iki katına çıkarma

int[] original = {1, 2, 3, 4, 5};
int[] doubleValues = new int[original.length];

for (int i = 0; i < original.length; i++) {
    doubleValues[i] = original[i] * 2;
}

// doubleValues dizisi şimdi {2, 4, 6, 8, 10} şeklinde olacaktır.
Bu kod parçacığı, 'original' adlı dizinin elemanlarını 'doubleValues' adlı diziye kopyalar ve
 kopyalanan her elemanı iki katına çıkarır

         */

    }
}
