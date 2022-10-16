package practice.selenium;

public class MaxAndMinElementsInArray {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 100, 50, 90 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum Element in Array is:" + max);
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Minimum Element in Array is:" + min);
	}
}
