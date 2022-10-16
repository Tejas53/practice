package practice.selenium;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Check=");
		int orgnum = sc.nextInt();
		int num = orgnum;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (rev == orgnum) {
			System.out.println("number is palindrome" + "  " + rev);
		} else {
			System.out.println("Number is not palindrome");
		}

	}
}
