package Entrata_SeleniumTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WatchDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", 
				"C:\\Users\\lenovo\\OneDrive\\Desktop\\TestProject_Selenium\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.entrata.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='button-default solid-dark-button'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Suraj");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Nagarale");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("surajnagrale263@gmail.com");
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@id='Phone']")).sendKeys("9579128488");
		
		Thread.sleep(2000);
		
		WebElement select = driver.findElement(By.xpath("//select[@id='Unit_Count__c']"));
		
		Select s= new Select(select);
		
		s.selectByVisibleText("1 - 10");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Title']")).sendKeys("QA Engineer");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
