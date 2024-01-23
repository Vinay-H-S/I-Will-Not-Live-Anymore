package com.xworkz.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContainsOnlyOddNumbers {

    public static boolean containsOdd(List<Integer> number){

        return number.parallelStream().anyMatch(x->x%2!=0);
    }

//    public static boolean contains(List<Integer> num){
//        for (int i:num){
//            if(i % 2 ==0){
//                return false;
//            }
//        }
//        return  true;
//    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(7);

        System.out.println("Contain odd :"+containsOdd(list));


    }





}
