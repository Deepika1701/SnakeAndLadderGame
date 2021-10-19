package com.bridgelabs.SnakeAndLadder;

public class SnakeAndLadderProgram {

    public static void main(String args[]){

        double empCheck = (Math.floor(Math.random() * 10) % 5) + 1;
        double randomNum = Math.random();
        double randomNum2 = randomNum * 10;
        double randomNum3 = Math.floor(randomNum2);
        double dieRoll = (randomNum3 % 5) +1;
        System.out.println("PLayer get " +dieRoll+ " after rolling a die ");

    }
}
