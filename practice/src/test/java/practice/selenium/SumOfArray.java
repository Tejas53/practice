package practice.selenium;

public class SumOfArray {
public static void main(String[] args) {
	int a[]= {2,5,6,9,3,7,1};
	int sum=0;
	for(int value:a)
	{
		sum=sum+value;
	}
	System.out.println("Sum of Array is:"+sum);
	for(int i=0;i<=a.length-1;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("Sum of Array is:"+sum);
}
}
