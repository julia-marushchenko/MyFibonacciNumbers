/**
 *  Java program to demonstrate Fibonacci numbers.
 */

package com.mynumbers;

/**
 *  Main class.
 */
public class Main {
    public static void main(String[] args) {

        // Given number.
        int number = 10;

        // Calling method.
        myFibonacci(10); // Output: 0 1 1 2 3 5 8 13 21 34

    }

    // Method to print Fibonacci numbers.
    public  static void myFibonacci(int number){

        // First and second elements.
        int num1 = 0;
        int num2 = 1;

        // Printing number.
        for(int i = 0; i < number; i++){

            System.out.print(num1 + " ");

            // Swap.
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
}