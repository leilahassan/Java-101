package com.example.student.java_101;

/**
 * Created by Student on 2/18/2017.
 */

public class MathsClass {
    //Declaring variables.
    private int age;
    private double shoeSize;
    private String firstName;

    //Initializing variables
    private int sum = 40;
    private int classHours = 8;
    private static String homeAddress = "74 mombasa";



    public static void main(String args[]) {
        String dayOfTheWeek = "Saturday";
        System.out.println(dayOfTheWeek);
        System.out.println(message());
        addition();
        System.out.println(addNumbers());


    }



    private static void addition(){
          int a = 24;
          int b =34342;
          int c = a + b;
          System.out.println("Answer is: " + c);

    }

    private static String message(){
        String message = "welcome to Akirachix";
        return message;

    }


    private static int addNumbers(){
        int a = 20;
        int b = 35;
        return a + b;


    }

}

































