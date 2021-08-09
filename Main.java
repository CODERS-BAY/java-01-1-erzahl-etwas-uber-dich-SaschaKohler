package com.sksoft;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String hello = " Hello World! ";

        System.out.println(hello.length());
        System.out.println(hello.toUpperCase());
        System.out.println(hello.replaceAll("World" , "Codersbay" ));
        System.out.println();
        System.out.println(hello.charAt(0));

        System.out.println(hello.trim());

        for(int i = 0; i < 15 ; i++){
            int rownumber = i +1;
            System.out.println( rownumber +": " + hello.trim() );
        }
    }
}
