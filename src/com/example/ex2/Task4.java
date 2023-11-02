package com.example.ex2;

public class Task4 {
    public static void main(String[] args) {

        int min = 50;
        int max = 100;
        int rdm;

        rdm = (int)(Math.random()*(max - min + 1) + min);
        int amountOfBricks = rdm;

        if(amountOfBricks%2 == 1){
            System.out.println("The amount of bricks is: " + amountOfBricks);
            //It should not display anything if the number is even
        }

        int min1 = 5;
        int max1 = 10;
        int containerCapacity;

        containerCapacity = (int)(Math.random()*(max1 - min1 + 1) + min1);

        if(containerCapacity%2 == 0){
            System.out.println("The number of Lego blocks that can fit in one container is: " + containerCapacity);
            //There will be nothing displayed if the number is odd
        }

        System.out.println("The number of filled containers is: " + amountOfBricks/containerCapacity);
        System.out.println("The number of bricks left will be: " + amountOfBricks % containerCapacity);

    }
}