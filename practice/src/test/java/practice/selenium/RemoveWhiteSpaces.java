package practice.selenium;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String str = "Java    Programming    Selenium   Automation";
		System.out.println("Before removing White Spaces" + str);
		str=str.replaceAll("\\s", "");
		System.out.println("After removing White Spaces:" + str);
	}
}
