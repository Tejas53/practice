package practice.selenium;

import java.util.Scanner;

public class CountSumOfDigits {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Number:");
	int num,sum;
	num=sc.nextInt();
	sum=0;
	while(num>0)
	{
		sum=sum+num%10;
		num=num/10;
	}
	System.out.println("Sum of the Digits of Number is:"+ sum);
	
}
}
