package practice.selenium;

import java.util.Scanner;

public class FactorialNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Number to find Factorial");
	int num= sc.nextInt();
	long factorial=1;
	//Ascending method
	for(int i=1;i<=num;i++)
	{
		factorial=factorial*i;
	}
	System.out.println("Factorial of a Number is:"+factorial);
	//Descending method
	for(int i=num;i<num;i--)
	{
		factorial=factorial*i;
	}
	System.out.println("Factorial of a Number is:"+factorial);
}
}
