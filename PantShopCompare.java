package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class PantShopCompare extends BaseTest{
	
	@Test
	public void compareList() throws InterruptedException {
		
		driver.findElement(By.xpath(Loc.getProperty("shop_pants"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Loc.getProperty("size"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Loc.getProperty("size_no"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Loc.getProperty("material"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Loc.getProperty("cool_tech"))).click();
		driver.findElement(By.xpath(Loc.getProperty("orange"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Loc.getProperty("compare"))).click();
		
	}
}
