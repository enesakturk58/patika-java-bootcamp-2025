package com.patika.enesakturk.week01.cohort._1_practices.dersler.arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // eleman sayisi
        numbers[0] = 12;
        numbers[1] = 23;
        numbers[2] = 34;
        numbers[3] = 45;
        numbers[4] = 56;

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Numbers listesinin = " + (i+1) + ". elamani : " + numbers[i]);
        }

        System.out.println("------------");

        int[] numbers2 = {2,3,4,5,6,7};

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Numbers2 listesinin = " + (i+1) + ". elamani : " + numbers2[i]);
        }
        int index = 1;

        for (int num : numbers){
            System.out.println(index + ". veri : " +num);
            index++;
        }
    }
}
