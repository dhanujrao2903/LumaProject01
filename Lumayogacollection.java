package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Lumayogacollection extends BaseTest {
	@Test
	public void lumashopNewYoga() throws InterruptedException  {
		driver.findElement(By.xpath(Loc.getProperty("shop_new_yoga"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("category"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("fashion"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("gender"))).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath(Loc.getProperty("men"))).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath(Loc.getProperty("new"))).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath(Loc.getProperty("yes"))).click();






		
		
		
		
		
	}

}
