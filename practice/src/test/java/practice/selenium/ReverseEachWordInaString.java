package practice.selenium;

public class ReverseEachWordInaString {
public static void main(String[] args) {
	//Approach 1
	String str ="Welcome to Java";
	String[] words=str.split(" ");
	String reverseString="";
	for (String w:words)
	{
		String reverseword="";
		for (int i = w.length()-1; i >=0; i--)
		{
			reverseword=reverseword+w.charAt(i);
		}
		reverseString=reverseString+reverseword+" ";
	}
	System.out.println(reverseString);
	//Approach 2
	String str1="emocleW ot avaJ";
	String[] word=str1.split("\\s");		
	String reverse_word="";
	for (String w1 : word) {
		StringBuilder sb=new StringBuilder(w1);
		sb.reverse();
		reverse_word=reverse_word+sb.toString()+" ";
	}
		System.out.println(reverse_word);
		
	}
	
} 

