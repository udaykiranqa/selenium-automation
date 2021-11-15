package locators.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathExamples {
	
	public static void main(String[] args) {
		
		
		// 1. Open browser -- chrome
		WebDriverManager.chromedriver().setup(); // to driver your browser
		WebDriver driver = new ChromeDriver(); // methods with browser
		
		//2. open application
		driver.get("https://www.google.com/");
		
		//3. enter some input in searchbox
		
		//absolute xpath
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
		
		// relative xpath
		
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("welcome");
		
		
		
		
		
		
		
	}
}
