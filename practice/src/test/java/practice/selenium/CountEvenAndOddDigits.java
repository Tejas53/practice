package practice.selenium;

import java.util.Scanner;

public class CountEvenAndOddDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		int rem;
		int even_count = 0;
		int odd_count = 0;
		while (num > 0) {
			rem = num % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			num = num / 10;
		}
		System.out.println("Even Digits are:"+even_count);
		System.out.println("Even Digits are:"+odd_count);

	}
}
