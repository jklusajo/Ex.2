package com.example.ex2;

public class Task3 {
    public static void main(String[] args) {

        int numberPickedRandomly = (int)(Math.random()*(100-1));

        if(numberPickedRandomly%2 == 0){
            System.out.println("This number leaves no remainder when divided by 2. It is therefore an even number");
        } else {
            System.out.println("This number cannot by divided by 2 and it is therefore an odd number");
        }
    }
}