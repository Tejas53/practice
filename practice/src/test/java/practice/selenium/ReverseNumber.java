package practice.selenium;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number=");
		int num = sc.nextInt();
		// method 1
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse of Number is=" + rev);
        //method 2
		System.out.println("Enter a Number=");
		num=sc.nextInt();
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		StringBuffer rev1= sb.reverse();
		System.out.println("Reverse Of Number is="+rev1);
		//method 3
		StringBuilder sbl= new StringBuilder();
		sbl.append(num);
		StringBuilder rev2;
		rev2=sbl.reverse();
		System.out.println("Reverse of Number is="+rev2);
		
		

	}

}
