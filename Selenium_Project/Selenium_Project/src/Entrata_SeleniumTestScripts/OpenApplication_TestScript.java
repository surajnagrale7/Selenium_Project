package Entrata_SeleniumTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication_TestScript {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.driver.chrome", 
				"C:\\Users\\lenovo\\OneDrive\\Desktop\\TestProject_Selenium\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.entrata.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
