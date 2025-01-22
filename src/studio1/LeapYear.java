package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Year:");
		int year = in.nextInt();
		double divFourRem = year % 4;
		boolean divFour = divFourRem == 0;
		double divHundredRem = year % 100;
		boolean divHundred = divHundredRem != 0;
		double divFourHundredRem = year % 400;
		boolean divFourHundred = divFourHundredRem == 0;
		boolean leapYear = (divHundred && divFour) || divFourHundred;
		System.out.print("Leap Year: " + leapYear);
	}

}
