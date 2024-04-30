package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Edit_Cart extends BaseTest {
	 @Test
	public void upDateCart() throws InterruptedException{
		 
	
			
			driver.findElement(By.xpath(Loc.getProperty("Whats_new"))).click();
			
			
			driver.findElement(By.xpath(Loc.getProperty("hoodies"))).click();
			
		driver.findElement(By.xpath(Loc.getProperty("style"))).click();
			
			driver.findElement(By.xpath(Loc.getProperty("full_zip"))).click();
			driver.findElement(By.xpath(Loc.getProperty("size"))).click();
			driver.findElement(By.xpath(Loc.getProperty("medium"))).click();
			driver.findElement(By.xpath(Loc.getProperty("green"))).click();
			driver.findElement(By.xpath(Loc.getProperty("cart"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(Loc.getProperty("item"))).click();
			
			driver.findElement(By.xpath(Loc.getProperty("edit_item"))).click();
		
			driver.findElement(By.xpath(Loc.getProperty("large"))).click();
		
			driver.findElement(By.xpath(Loc.getProperty("purple"))).click();
			
			driver.findElement(By.xpath(Loc.getProperty("update_cart"))).click();
			
			





			
			
			
			
			
			
			
		


		
		
	}
}
