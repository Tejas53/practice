package practice.selenium;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Check:");
		int num = sc.nextInt();
		int count = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) 
			{
				if (num % i == 0) 
				
					count++;
			}	
				if (count == 2)
				{
					System.out.println("Number is Prime Number");
				}
			
				else
				{
					System.out.println("Not a Prime Number");
				}
			
		} 
		else 
		{
			System.out.println("Not a Prime Number");
		}
	}
}