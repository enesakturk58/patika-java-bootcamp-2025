package com.patika.enesakturk.week01.cohort;

public class string {
    public static void main(String[] args) {
        String name = "Merhaba, dünya";
        System.out.println("name = " + name);

        int nameLength = name.length();
        System.out.println("nameLength = " + nameLength);

        String nameToLower = name.toLowerCase();
        System.out.println("nameToLower = " + nameToLower);

        String nameToUpper = name.toUpperCase();
        System.out.println("nameToUpper = " + nameToUpper);

        System.out.println("6. harf = " + name.charAt(5));

        System.out.println("Enes Aktürk".substring(2));
        System.out.println(name.substring(2));

        String hi = "Hello,";
        System.out.println(hi + " World..!");

        boolean isStringEquals = hi.equals(name);
        System.out.println("isStringEquals = " + isStringEquals);

        boolean isStringEquals2 = "enes".equals("patika");
        System.out.println("isStringEquals2 = " + isStringEquals2);

        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "java";
        String s4 = "Java";

        System.out.println("Equals ; s1 == s2 : " + s1.equals(s2));
        System.out.println("Equals ; s1 == s3 : " + s1.equals(s3));
        System.out.println("Equals ; s1 == s4 : " + s1.equals(s4));

        // Aşağıda anlamadığım bir problem var.. Bu problemi araştır.
        // Burası önemli çünkü equals ile == arasinda ki fark RAM de tutulan yer ile alakalı olabilir.
        // == adres mi karşilaştiriyor. ? o zaman int değerinde iki aynı sarı verisi aynı adresde mi tutuluyor ?

        boolean s1S2 = s1 == s2;
        System.out.println("s1 == s2 : " + s1S2);
        System.out.println("s1 == s3 : " + s1 == s3);
        System.out.println("s1 == s4 : " + s1 == s4);


    }
}
