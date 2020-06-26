package LessonTwo;

import java.util.Scanner;

public class LessonTwoHomework {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
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
			case 4:
				bonusQuestion();
				break;
			}
		}
	}

	/**
	 * write a program that prints the numbers from 1 to 10 and from 10 to 1
	 */
	public static void exerciseOne() {
		int num = 1;
		while (num <= 10) {
			System.out.println(num);
			num = num + 1;
		}
		num = num - 1;
		while (num >= 1) {
			System.out.println(num);
			num = num - 1;
		}
	}

	/**
	 * Given three integers: a, b, and c, calculate their precise average and print
	 * which ones are greater than it
	 */
	public static void exerciseTwo() {
		System.out.print("A is: ");
		int a = sc.nextInt();
		System.out.print("B is: ");
		int b = sc.nextInt();
		System.out.print("C is: ");
		int c = sc.nextInt();
		double average = (a + b + c) / 3;
		if (a > average) {
			System.out.println(a);
		}
		if (b > average) {
			System.out.println(b);
		}
		if (c > average) {
			System.out.println(c);
		}

	}

	/**
	 * write a program that prints out all the numbers from 1 to 100, except
	 * replaces odd numbers with the text "ODD"
	 */
	public static void exerciseThree() {
		int num = 1;
		while (num <= 100) {
			if (num % 2 != 0) {
				System.out.println("ODD");
			} else {
				System.out.println(num);
			}
			num = num + 1;
		}
	}

	/**
	 * write a program that prints out the first n (given) prime numbers
	 */
	public static void bonusQuestion() {
		System.out.println("Enter how many prime numbers you would like to see: ");
		int input = sc.nextInt();
		int num = 2;
		int count = 0;
		while (count < input) {
			boolean prime = true;
			for (int i = 2; i <= num / 2 && prime == true; i++) {
				if (num % i == 0) {
					prime = false;
				}
			}
			if (prime == true) {
				System.out.print(num + ", ");
				count++;
			}
			num++;
		}

	}

}