package practice.selenium;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String=");
		String str = sc.next();
		// method 1
		String rev="";
		int len = str.length();
		
		for(int i= len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse of String is=" + rev);
		// method 2
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev1 = sb.reverse();
		System.out.println("Reverse Of String is=" + rev1);
		// method 3
		StringBuilder sbl = new StringBuilder(str);
		System.out.println("Reverse Of String is=" + sbl.reverse());
		// method 4
		System.out.println("Enter a String=");
		str = sc.next();
		rev="";
		len = str.length();
		char a[]=str.toCharArray();
		for(int i= len-1;i>=0;i--) {
			rev= rev+a[i];
		}
		System.out.println("Reverse of String is=" + rev);

	}

}
