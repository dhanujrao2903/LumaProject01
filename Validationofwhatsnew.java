package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Validationofwhatsnew  extends BaseTest {
	
	@Test
	public  void getWhatsNew() {
		
		driver.findElement(By.xpath(Loc.getProperty("Whats_new"))).click();
		
		
		driver.findElement(By.xpath(Loc.getProperty("hoodies"))).click();
		
	driver.findElement(By.xpath(Loc.getProperty("style"))).click();
		
		driver.findElement(By.xpath(Loc.getProperty("full_zip"))).click();
		driver.findElement(By.xpath(Loc.getProperty("size"))).click();
		driver.findElement(By.xpath(Loc.getProperty("medium"))).click();
		driver.findElement(By.xpath(Loc.getProperty("green"))).click();
		driver.findElement(By.xpath(Loc.getProperty("cart"))).click();
		
		
	}

}
