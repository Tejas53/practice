package practice.selenium;

import java.util.Scanner;

public class PalindromeString2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to Check=");
		String orgstr = sc.next();
		StringBuffer str;
		int len = orgstr.length();
		System.out.println("Length of String:" + " " + len);
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + orgstr.charAt(i);
		}
		System.out.println("Reverse String is =" + rev);
		if (orgstr.equals(rev)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}

		StringBuffer sb = new StringBuffer(orgstr);
		str = sb;
		sb = sb.reverse();
		if (str.equals(sb)) {
			System.out.println("it is palindrome string" + "  " + sb);
		} else {
			System.out.println("it is not palindrome string");
		}

	}
}
