package practice.selenium;

public class CountCharacterOccurances {
	public static void main(String[] args) {
		String s = "Java Programming Java OOPs";
		int total_count = s.length();
		int ttlcnt_afterRemove = s.replace("a", "").length();
		int count = total_count - ttlcnt_afterRemove;
		System.out.println("Number Of Occurance of a is:" + count);
	}
}
