package com.assignment1;

import java.math.BigInteger;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger a, b;
        while(true){
            System.out.println("For addition enter 1 \n for sub enter 2 \n for multi enter 3 \n for div enter 4 \n for exit enter e");
            char input = sc.next().charAt(0);
            if(input=='e'){
                break;
            }
            System.out.println("enter 2 nums");
            a = sc.nextBigInteger();
            b = sc.nextBigInteger();
            switch (input){
                case '1': {
                    System.out.println(a.add(b));
                    break;
                }
                case '2': {
                    System.out.println(a.subtract(b));
                    break;
                }
                case '3': {
                    System.out.println(a.multiply(b));
                    break;
                }
                case '4':
                    System.out.println(a.divide(b));
                    break;
            }
        }
    }
}
