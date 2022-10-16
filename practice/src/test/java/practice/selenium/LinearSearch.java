package practice.selenium;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 60, 70 };
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element to Search:");
		int search_ele =sc.nextInt() ;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (search_ele == a[i]) {
				System.out.println("Element found at:" + i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Element Not Found");
		}
	}

}
