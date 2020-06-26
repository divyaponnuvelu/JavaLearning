package LessonFour;

import java.util.Scanner;

public class ClassworkLeapYear {

	public static Scanner sc = new Scanner(System.in);

	public static boolean isLeap(int year) {
		if (year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					return true;
				}else {
					return false;
				}
			}else {
				return true;
			}
		} else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		ClassworkLeapYear x = new ClassworkLeapYear();
		System.out.println("Enter a year to check if it is a leap year: ");
		int y = sc.nextInt();
		if (isLeap(y)) {
			System.out.println("It is a leap year");
		} else {
			System.out.println("It is not a leap year");
		}
	}
}