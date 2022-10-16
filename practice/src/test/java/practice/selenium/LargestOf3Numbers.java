package practice.selenium;

import java.util.Scanner;

public class LargestOf3Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1:");
		int num1 = sc.nextInt();
		System.out.println("Enter Number 2:");
		int num2 = sc.nextInt();
		System.out.println("Enter Number 3:");
		int num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("The Largest Number is:" + num1);
		}
		if (num2 > num1 && num2 > num3) {
			System.out.println("The Lagest Number is:" + num2);
		} else {
			System.out.println("The Largest Number is:" + num3);
		}
		// Ternary Operator
		int largest = (num1 > num2 ? num1 : num2) > num3 ? (num1 > num2 ? num1 : num2) : num3;
		System.out.println("The Largest Among the Three Numbers is:" + largest);
	}
}
