package locators.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsClassNameEx {

	public static void main(String[] args) {

		// 1. Open browser -- chrome
		WebDriverManager.chromedriver().setup(); // to driver your browser
		WebDriver driver = new ChromeDriver(); // methods with browser
		
		//open application
		driver.get("https://www.google.com/");
		
		//className
		driver.findElement(By.className("gb_f")).click();

	}
}
