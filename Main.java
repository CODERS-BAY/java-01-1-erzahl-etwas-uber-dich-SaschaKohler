package com.sksoft;

import java.time.LocalDate;
import java.time.Period;

public class Main {


    private static Object Period;

    public static void main(String[] args) {
	// write your code here
        String firstName = "Sascha";
        String lastName = "Kohler";
        char gender = 'm';

        LocalDate dateOfBirth = LocalDate.of(1972,2,3);
        LocalDate today = LocalDate.now();

        boolean is_married = true;

        double note = 2;

        System.out.println("Talk about me!! \n");

        Period period= java.time.Period.between(dateOfBirth,LocalDate.now());
        int ageInYears = period.getYears();


        System.out.println("Hello, my name is "+ firstName + " " + lastName + "\n");
        System.out.println("I'am " + ageInYears + " years old (date of Birth 03.Februar 1972)" );
        if(is_married){
            System.out.println("I'am married\n");
        }
        else{
            System.out.println("still not married\n");
        }

        System.out.println("my averge note "+ note +"\n" );


    }

   }
