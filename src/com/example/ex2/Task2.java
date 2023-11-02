package com.example.ex2;

public class Task2 {
    public static void main(String[] args) {

        float earthWeightLusajo;
        float marsWeightLusajo;
        double marsWeightLusajoInDouble;
        int marsWeightLusajoInInt;

        earthWeightLusajo = 55;
        marsWeightLusajo = earthWeightLusajo * 0.38F;
        System.out.println(earthWeightLusajo + " kg on Earth is equivalent to " + marsWeightLusajo + " kg on Mars.");

        marsWeightLusajoInDouble = marsWeightLusajo;
        System.out.println("The mass on Mars after converting it to double is: " + marsWeightLusajoInDouble);

        System.out.printf("Mass on Mars displayed after converting it into four decimal points is: %.4f %n", marsWeightLusajoInDouble);

        marsWeightLusajoInInt = (int) marsWeightLusajoInDouble;
        System.out.println("After being casted to integer, the current amount displayed is: " + marsWeightLusajoInInt);

        char j = (char) marsWeightLusajoInInt;
        System.out.println("After being cast to char type, the result is: " + j);

        int newChar = j * j;
        System.out.println("An Example of a Mathematical operation on char is: " + newChar);
    }
}