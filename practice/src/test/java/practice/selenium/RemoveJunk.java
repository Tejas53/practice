package practice.selenium;

public class RemoveJunk {
public static void main(String[] args) {
	String s="@$%%$&%$154316843 Latin!@!%^&String";
	String s1="@$^&%#&*(&^Selenium@$#@((*^$%%Java";
	s=s.replaceAll("[^a-zA-Z]", "");
	System.out.println(s);
	s1=s1.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s1);
}
}
