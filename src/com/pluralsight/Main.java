package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /*
    https://programmingbydoing.com/

    Counting Machine - Assignment 66
     */

    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner(System.in);

        int x;

        do {
            System.out.println("Enter a number. I will count up to that number from 0");

            try {
                x = keyboard.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Wrong kind of input.");
                keyboard.next();
            }
        }
        while(true);

        for (int n = 0; n <= x; n++ ){
            System.out.print(n + " ");
        }

    }
}
