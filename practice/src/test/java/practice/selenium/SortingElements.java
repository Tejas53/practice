package practice.selenium;

import java.util.Arrays;import java.util.Collections;

public class SortingElements {
public static void main(String[] args) {
	//Approach 1
	int a[]= {30,20,50,40,60,10};
	System.out.println("Array Element Before Sorting"+Arrays.toString(a));
	Arrays.parallelSort(a);
	System.out.println("Array Element After Sorting"+Arrays.toString(a));
	//Approach 2
	int a1[]= {55,98,36,45,12,78};
	System.out.println("Array Element Before Sorting"+Arrays.toString(a1));
	Arrays.sort(a1);
	System.out.println("Array Element After Sorting"+Arrays.toString(a1));
	//Reverse Descending Order
	Integer a2[]= {36,65,74,11,56,15,32};
	System.out.println("Array Element Before Sorting"+Arrays.toString(a2));
	Arrays.sort(a2,Collections.reverseOrder());
	System.out.println("Array Element After Sorting"+Arrays.toString(a2));
}
}
