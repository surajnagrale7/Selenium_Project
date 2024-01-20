package Entrata_SeleniumTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToSignIn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", 
				"C:\\Users\\lenovo\\OneDrive\\Desktop\\TestProject_Selenium\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.entrata.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	//Click on Sign In button
		driver.findElement(By.xpath("//a[@class='button-default outline-dark-button']")).click();
		
		//Click on Resident Login
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Resident Login']")).click();
		
		//Navigate to view the website
		driver.findElement(By.xpath("//div[text()='View the Website']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
