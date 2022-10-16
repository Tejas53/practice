package practice.selenium;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

public class GenerateRandomNumbrsAndStrings {
	public static void main(String[] args) {
		// Random Number: Using Random class-from java.util.Random
		Random rand = new Random();
		int rand_int = rand.nextInt(1000);
		System.out.println("Random Number Generated is:" + rand_int);
		double rand_dbl = rand.nextDouble();
		System.out.println("Random Number Generated is:" + rand_dbl);
		//Random Number-Using Math class
		System.out.println("Random Number Generated is:"+Math.random());
		// Random String: Using RandomStringUtils class- from apache commons
		RandomStringUtils randstr = new RandomStringUtils();
		String rand_str = randstr.randomAlphabetic(8);
		System.out.println("Random Number Generated is:" + rand_str);
	}

}
