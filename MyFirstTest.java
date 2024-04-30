package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTest{

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().clearDriverCache().setup();
		   WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		   driver.get("https://magento.softwaretestingboard.com/");
			driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Rajan");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("kumar");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("ramu2801@gmail.com");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("rajendra@1991");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("rajendra@1991");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")).click();


	











	}

}
