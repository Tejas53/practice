package practice.selenium;

public class MissingNumberInArray {
	public static void main(String[] args) {
		// Array should not have duplicates
		// Array no need to be sorted
		// values should be in range
		int a[] = { 1, 2, 3, 4, 6 };
		// sum1=1+2+3+4+6=16
		// sum2=1+2+3+4+5+6=21
		// sum2-sum1=21-16=[5]----missing number
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of Elements in Array:" + sum1);
		int sum2 = 0;
		for (int i = 1; i <=6; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("Sum of Range of Elements in Array:"+sum2);
		System.out.println("Missing Element in Array is:"+(sum2-sum1));
	}
}
