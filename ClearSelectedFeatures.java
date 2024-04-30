package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class ClearSelectedFeatures  extends BaseTest{
	@Test
	public void clearFeatures() throws InterruptedException {
		
		driver.findElement(By.xpath(Loc.getProperty("Whats_new"))).click();
		
		driver.findElement(By.xpath(Loc.getProperty("hoodies"))).click();
		
		driver.findElement(By.xpath(Loc.getProperty("style"))).click();
		
			
			driver.findElement(By.xpath(Loc.getProperty("full_zip"))).click();
			
			driver.findElement(By.xpath(Loc.getProperty("climate"))).click();
		
			driver.findElement(By.xpath(Loc.getProperty("windy"))).click();
			
			driver.findElement(By.xpath(Loc.getProperty("clear_all"))).click();
		
	}

}
