package com.assignment1;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter min number");
        int mini = sc.nextInt();
        System.out.println("Enter max number");
        int maxi = sc.nextInt();


        int num = (int)(mini + (maxi-mini)*Math.random());

        System.out.println("Guess a number between " + mini + " & " + maxi);
        int guess = sc.nextInt();

        while(guess!=num){
            if(guess>num){
                System.out.println("choose less number");
            }
            else{
                System.out.println("choose greater number");
            }
            guess = sc.nextInt();
        }
        System.out.println("num is" + guess);
    }
}
