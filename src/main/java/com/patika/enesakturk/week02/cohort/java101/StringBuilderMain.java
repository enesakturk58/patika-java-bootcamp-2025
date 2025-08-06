package com.patika.enesakturk.week02.cohort.java101;

public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String name = "patika.dev";

        System.out.println("name = " + name);
        System.out.println("name.replace(\"p\",\"P\") = " + name.replace("p", "P"));
        System.out.println("name = " + name);

        System.out.println("---------------  String Builder ornekleri  ---------------");
        stringBuilder.append("patika");
        System.out.println("stringBuilder = " + stringBuilder);
        System.out.println("stringBuilder.replace(\"p\",\"P\") = " + stringBuilder.replace(0, 5,"P"));
        System.out.println("stringBuilder = " + stringBuilder);

        StringBuilder alphabet= new StringBuilder();

        for (char current = 'a' ; current <= 'z' ; current++ ){
            alphabet.append(current); // alphabet += current
        }
        System.out.println();
        System.out.println("alphabet = " + alphabet);

        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("patika").append(".dev").append(" java.");
        System.out.println();
        System.out.println("stringBuilder1 = " + stringBuilder1);

        stringBuilder1.append(2);
        System.out.println();
        System.out.println("stringBuilder1 = " + stringBuilder1);

        var hello = "hello patika";
        var hello2 = "hello patika";

        System.out.println();
        System.out.println("hello.equals(hello2) = " + hello.equals(hello2));
        System.out.println("hello2 == hello = " + (hello2 == hello));

        String s = "Hello world";
        String s1 = " Hello world";

        System.out.println();
        System.out.println("s.equals(s1) = " + s.equals(s1));
        System.out.println("s == s1 = " + (s == s1));

        var singleString = "hello world";
        var concat = "hello";
        concat += " world";

        System.out.println();
        System.out.println("singleString.equals(concat) = " + singleString.equals(concat));
        System.out.println("(singleString == concat) = " + (singleString == concat));

         var hello3 = "Hello World";
        // var hello4 = new String("Hello World");
        var hello4 = new String("Hello World").intern();

        System.out.println();
        System.out.println("hello3.equals(hello4) = " + hello3.equals(hello4));
        System.out.println("(hello3 == hello4) = " + (hello3 == hello4));


    }
}
