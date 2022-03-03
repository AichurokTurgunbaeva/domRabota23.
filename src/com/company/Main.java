package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> jupSandar = new ArrayList<>();
        ArrayList<Integer> takSandar = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int a = random.nextInt(1,100);
            arrayList.add(a);
            int counter = 0;
            if (a % 2 == 0) {
                counter += a;
                jupSandar.add(counter);}
            int counter1 = 0;
            if (a % 2 == 1) {
                counter1 += a;
                takSandar.add(counter1);
            }
        }
        System.out.println("Массивдин ичиндеги жалпы сандар: "+arrayList);
        System.out.println("Массивдин ичиндеги жуп сандар: "+jupSandar);
        System.out.println("Массивдин ичиндеги так сандар: " +takSandar);
    }
}

