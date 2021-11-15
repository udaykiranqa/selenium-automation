package locators.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class VerifyLoginFunctionality {
	
	public static void main(String[] args) {
		
		//chrome
		WebDriverManager.chromedriver().setup(); // driver your browser
		ChromeDriver driver1 = new ChromeDriver(); //open browser
		driver1.get("https://www.facebook.com/");
		
		//firefox
		WebDriverManager.firefoxdriver().setup(); // driver your browser
		FirefoxDriver driver2 = new FirefoxDriver(); //open browser
		driver2.get("https://www.facebook.com/");
		
		//edge browser
		
		WebDriverManager.edgedriver().setup(); // driver your browser
		EdgeDriver driver3 = new EdgeDriver(); //open browser
		driver3.get("https://www.facebook.com/");
		
	}
	
	
	

}
