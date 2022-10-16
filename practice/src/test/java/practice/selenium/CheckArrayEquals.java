package practice.selenium;

public class CheckArrayEquals {
	public static void main(String[] args) {
		int a1[] = { 1, 3, 5, 2, 9, 4, 6 };
		int a2[] = { 1, 3, 5, 2, 9, 4, 6 };
		// Approach 1
		/*
		 * boolean status = Arrays.equals(a1, a2); if (status == true) {
		 * System.out.println("Arrays are Equal"); } else {
		 * System.out.println("Arrays are Not Equal"); }
		 */
		// Approach 2
		boolean status = true;
		if (a1.length == a2.length) {
			for (int i = 0; i <a1.length; i++) {
				if (a1[i] != a2[i]) {
					status = false;
				}
			}
		} else {
			status = false;
		}
		if (status == true) {
			System.out.println("Arrays are Equal");
		} else {
			System.out.println("Arrays are not Equal");
		}
	}
}
