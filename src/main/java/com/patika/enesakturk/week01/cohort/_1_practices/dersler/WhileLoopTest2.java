package com.patika.enesakturk.week01.cohort._1_practices.dersler;

public class WhileLoopTest2 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while(i < 5){

            if(i % 5 == 0){
                System.out.println(i + " Degeri hesaba dahil degildir.");
                i++;
                    continue;
            }

            sum += i;
            i++;
        }
        System.out.println("Toplam : " + sum);
    }
}
