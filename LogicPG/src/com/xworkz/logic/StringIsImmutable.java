package com.xworkz.logic;

public class StringIsImmutable {

    public static void main(String[] args) {
        String progLang1="Java";
        String progLang2=progLang1;

        System.out.println(progLang1==progLang2);
        System.out.println(progLang2);

        progLang1="Python";
        //in the above case a new String "Python" got created in the pool
        //s1 is now referring to the new String in the pool
        //BUT, the original String "Java" is still unchanged and remains in the pool
        //s2 is still referring to the original String "Java" in the pool

        System.out.println(progLang1==progLang2);
        System.out.println(progLang2);

    }
}
