package locators.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsLinks {
	
	public static void main(String[] args) {
		
	//1. Open browser -- chrome
		
		WebDriverManager.chromedriver().setup(); // to driver your browser
		WebDriver driver = new ChromeDriver(); //methods with browser
		
		//2. Access application
		driver.get("https://www.google.com/");
		
		//3. Click on Gmail link   -----linktext
		//driver.findElement(By.linkText("Gmail")).click();
		
		//4. Click on Gmail link   -----PartialLinktext
		driver.findElement(By.partialLinkText("Gmai")).click();
	 
		// Navigation commands
		driver.navigate().back(); 	//back
		driver.navigate().forward(); //fwd..
		
		//refresh --f5
		
		driver.navigate().refresh();
		
	}

}
