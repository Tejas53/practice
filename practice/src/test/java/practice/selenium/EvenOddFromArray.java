package practice.selenium;

public class EvenOddFromArray {
	public static void main(String[] args) 
	{
		int a[] = { 1, 2, 5, 6, 3, 8, 7 };
		// Extracting Even Numbers
		System.out.print("Even Numbers in Array:");
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] % 2 == 0) 
			{
				System.out.print(" "+a[i]);
			}
		}
		System.out.println("");
		//Extracting Odd Numbers
		System.out.print("Odd Numbers in Array:");
		for(int value:a)
		{
			if(value%2!=0)
			{
				System.out.print(" "+value);
			}
		}
	}
}
