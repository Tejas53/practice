package practice.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckboxes {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation/");
		/*
		 * List<WebElement> checkboxes = driver.findElements(By.
		 * xpath("//input[@type='checkbox' and contains(@id,'day')]")); int
		 * totalcheckboxes=checkboxes.size(); for (int i=
		 * totalcheckboxes-3;i<totalcheckboxes;i++) { checkboxes.get(i).click();
		 * System.out.println(checkboxes); }
		 */
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + ":" + cookie.getValue());
		}
				driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("size of cookies" + cookies.size());
	}
}
