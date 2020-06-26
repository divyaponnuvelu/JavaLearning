package LessonOne;

import java.util.Scanner;

public class LessonOneExercises {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        while (true) {
            System.out.print("Which exercise would you like to run? ");
            int exerciseNum = sc.nextInt();
            switch (exerciseNum) {
                case 1:
                    exerciseOne();
                    break;
                case 2:
                    exerciseTwo();
                    break;
                case 3:
                    exerciseThree();
                    break;
            }
        }
    }

    /**
     * Write a program that when given two integers as inputs, prints number A divided by number B. Remember that
     * integers are whole numbers, which means any decimals would be truncated (cut off)
     *
     * Examples:
     * 5/6 should be 0
     * 10/2 should be 5
     * 10/3 should be 3
     */
    public static void exerciseOne () {
    	System.out.print("Please enter an integer: ");
    	int numA = sc.nextInt();
    	System.out.println("Please enter another integer: ");
    	int numB = sc.nextInt();
    	System.out.println(numA / numB);	
    }

    /**
     * Write a program that when given two integers as inputs, prints the product of the two integers.
     *
     * Examples:
     * 6*5 should be 30
     * 7*8 should be 56
     */
    public static void exerciseTwo() {
     
    	System.out.print("Please enter an integer: ");
        int numA = sc.nextInt();
        System.out.println("Please enter another integer: ");
        int numB = sc.nextInt();
        System.out.println(numA * numB);	
    	
    }

    /**
     * Write a program that when given two integers as inputs, prints the remainder when the first integer is divided
     * by the second integer.
     *
     * Examples:
     * 10 % 3 should be 1
     * 42 % 5 should be 2
     */
    public static void exerciseThree() {
    	System.out.print("Please enter an integer: ");
        int numA = sc.nextInt();
        System.out.println("Please enter another integer: ");
        int numB = sc.nextInt();
        System.out.println(numA % numB);  
    }
}