package com.patika.enesakturk.week02.cohort.java101;

public class StringMain {
    public static void main(String[] args) {
        var s = "Lavanta";

        String flower = "Papatya";

        int lenght = flower.length();

        System.out.println(flower + " -> " + lenght + " karakterdeb olusmaktadır.");

        char firstIndex = flower.charAt(0);
        System.out.println("firstIndex = " + firstIndex);

        System.out.println("flower.indexOf('P') = " + flower.indexOf('P'));
        System.out.println("flower.indexOf('a') = " + flower.indexOf('a'));
        System.out.println("flower.indexOf('a',2) = " + flower.indexOf('a', 2));
        //System.out.println("flower.indexOf('a',1,5) = " + flower.indexOf('a', 1, 5));
        System.out.println("flower.substring(3) = " + flower.substring(3));
        System.out.println("flower.substring(3,5) = " + flower.substring(3, 5)); // 5. index dahil degildir.
        System.out.println("flower.toUpperCase() = " + flower.toUpperCase());
        System.out.println("flower.toUpperCase().substring(2,4) = " + flower.toUpperCase().substring(0, 2));
        System.out.println("flower.toLowerCase() = " + flower.toLowerCase());
        System.out.println("s.equals(flower) = " + s.equals(flower));
        System.out.println("\"Lavanta\".equals(flower) = " + "Lavanta".equals(flower));
        System.out.println("\"papatya\".equals(flower) = " + "papatya".equals(flower));
        System.out.println("\"papatya\".equalsIgnoreCase(flower) = " + "papatya".equalsIgnoreCase(flower));
        System.out.println("\"Papatya\".equals(flower) = " + "Papatya".equals(flower));
        System.out.println("flower.startsWith(\"Papa\") = " + flower.startsWith("Papa"));
        System.out.println("flower.startsWith(\"papa\") = " + flower.startsWith("papa"));
        System.out.println("flower.endsWith(\"yA\") = " + flower.endsWith("yA"));
        System.out.println("flower.endsWith(\"ya\") = " + flower.endsWith("ya"));
        System.out.println("flower.contains('f') = " + flower.contains("f"));
        System.out.println("flower.contains(\"pa\") = " + flower.contains("pa"));
        System.out.println("flower.replace(\"a\",\"t\") = " + flower.replace("a", "t"));
        System.out.println("flower = " + flower);


    }
}
