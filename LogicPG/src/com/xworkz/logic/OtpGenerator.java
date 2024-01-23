package com.xworkz.logic;


import java.util.Random;
import java.util.SplittableRandom;

public class OtpGenerator {

    public static String generateOtp(int otpLength){
        SplittableRandom splittableRandom=new SplittableRandom();

        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0; i<otpLength;i++){
            stringBuilder.append(splittableRandom.nextInt(0,10));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

//        System.out.println("OTP : "+OtpGenerator.generateOtp(4));
        Random random=new Random();
        int num;
        for(int i=0;i<6;i++){
           num=random.nextInt(999999);
            System.out.println("OTP :"+num);
        }

    }


}
