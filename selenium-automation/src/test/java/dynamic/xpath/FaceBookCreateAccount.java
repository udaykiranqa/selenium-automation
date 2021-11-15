package dynamic.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookCreateAccount {
	// test case

	public static void main(String[] args) {

		// step1: Open browser --chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); //chrome browser

		// step2: Open faceBook application
		driver.get("https://www.facebook.com/");

		// Step3: Click on Create new account button
		//	driver.findElement(By.id("u_0_2_hW")).click();
		
		//dynamic xpath
		//starts-with
	//	driver.findElement(By.xpath("//*[starts-with(@id, 'u_0_2_')]")).click();

		//conatins
		driver.findElement(By.xpath("//*[contains(@id, 'u_0_2_')]")).click();
		//Test comment ---enster mobile number and submit
	}

}
