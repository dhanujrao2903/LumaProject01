package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class LumapantshopPlaceorder extends BaseTest {
	@Test
	
	public void payment() throws InterruptedException {
		driver.findElement(By.xpath(Loc.getProperty("sign_in"))).click();
		 Thread. sleep(5000);
		 driver.findElement(By.xpath(Loc.getProperty("email_field"))).sendKeys(" ramu2801@gmail.com");
		 driver.findElement(By.xpath(Loc.getProperty("reg_psw"))).sendKeys( "rajendra@1991");
		 Thread. sleep(5000);
		 driver.findElement(By.xpath(Loc.getProperty("sign_in1"))).click();
			Thread.sleep(5000);

		
		driver.findElement(By.xpath(Loc.getProperty("shop_pants"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("size"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("size_no"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("material"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("cool_tech"))).click();
		driver.findElement(By.xpath(Loc.getProperty("orange"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("add"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("add12"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("checkout"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("next"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("order_place"))).click();
		Thread.sleep(5000);
		
		
		
		
		
	}

}
