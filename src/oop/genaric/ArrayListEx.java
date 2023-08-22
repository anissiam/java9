package oop.genaric;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {
    public static void main(String[] args) {
        /*Integer[] integers = new Integer[10];
        integers[0] = 10;
        integers[1] = 20;
        integers[2] = 30;
        integers[3] = 40;
        System.out.println(integers[0]);
        integers[1] = 60;*/

        //System.out.println(integers.length);
        /*for (Integer i: integers) {
            if (i == 10) {

            }
        }*/


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(900);
        arrayList.add(1000);
        arrayList.add(1200);

        ArrayList <Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(10);
        integerArrayList.add(20);
        integerArrayList.add(30);
        integerArrayList.add(40);
        integerArrayList.addAll(arrayList);

        integerArrayList.addAll(Arrays.asList(10, 50, 100));
        System.out.println(integerArrayList);
       /* //integerArrayList.trimToSize();
        //System.out.println(integerArrayList);
        System.out.println(integerArrayList.get(0));
        integerArrayList.set(1, 55);
        System.out.println(integerArrayList);
        //System.out.println(integerArrayList.size());
        int sum = 0;
        for (int i = 0; i < integerArrayList.size(); i++) {
            sum += integerArrayList.get(i);
        }
        System.out.println(sum);

        //integerArrayList.clear();
        integerArrayList.remove(1);
        System.out.println(integerArrayList);*/


        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("sami");
        stringArrayList.add("Ali");
        stringArrayList.add("anis");
        stringArrayList.add("SOSo");
        System.out.println(stringArrayList);
        stringArrayList.remove("Ali");
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.isEmpty());
        System.out.println(stringArrayList.contains("sami"));

    }
}
