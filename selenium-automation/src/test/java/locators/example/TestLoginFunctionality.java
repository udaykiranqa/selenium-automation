package locators.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLoginFunctionality {
	
	public static void main(String[] args) {

		//1. Open browser -- chrome
		
		WebDriverManager.chromedriver().setup(); // to driver your browser
		WebDriver driver = new ChromeDriver(); //methods with browser
		
		//2. Access application
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		//3. Enter userName and password --Identify
		
		//Locator ---id and name
		
		// enter userName
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		//enter password
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//hit submit 
		driver.findElement(By.name("Submit")).click();
		
		
	}

}
