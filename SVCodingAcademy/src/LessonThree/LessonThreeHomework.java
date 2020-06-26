package LessonThree;

import java.util.Scanner;

public class LessonThreeHomework {

	public static Scanner sc = new Scanner(System.in);

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
			}
		}
	}

	/**
	 * Print an isosceles triangle that is a given n levels high
	 **********
	 *********
	 ********
	 *******
	 ******
	 *****
	 ****
	 ***
	 **
	 *
	 */
	public static void exerciseOne() {
		System.out.println("Please enter the height of your desired isoceles triangle: ");
		int height = sc.nextInt();
		for (int row = 1; row <= height; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	/**
	 * Given n representing the height of the pattern, print a diagonal dotted lines
	 * (prints a * every odd level only)
	 * 
	  * * * * *
	   * * * *
	  * * * * *
	   * * * * 
	  * * * * *
	  
	 */
	public static void exerciseTwo() {
		
		System.out.println("Please enter the height of your desired isoceles triangle: ");
		int height = sc.nextInt();
		for (int row = height; row >= 1; row--) {
			for (int col = row-1; col >= 1; col--) {
				System.out.print(" ");
			}
			if(row % 2 == 1) {
				System.out.print("*");	
			}else{
				System.out.print(" ");
			}

			System.out.println();
		}
		
	}

	/*
	 * Write code (USING LOOPS) that prints the following pattern:
	 * 
	
	+/\/\/\/\/\+
    |          |
    +/\/\/\/\/\+
    +/\/\/\/\/\+
    |          |
    |          |
    |          |
    |          |
    |          |
    +/\/\/\/\/\+
	 * 
	 */
	public static void exerciseThree() {
		for (int i = 1; i <= 10; i++) {
			if (i == 1 || i == 3 || i == 4 || i == 10) {
				for (int j = 1; j <= 12; j++) {
					if (j == 1 || j == 12) {
						System.out.print("+");
					} else {
						if (j % 2 == 0) {
							System.out.print("/");
						} else {
							System.out.print("\\");
						}
					}
				}
				System.out.println();
			}else {
				for(int k = 1; k <= 12; k++) {
					if(k == 1 || k== 12) {
						System.out.print("|");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}

	}
}