package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class TakeItFromErin  extends BaseTest {
	@Test
	public void  shoperinReccomends() throws InterruptedException {
		
		driver.findElement(By.xpath(Loc.getProperty("luma_founder"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("next_page"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("eco_collection"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("no"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("small"))).click();
		driver.findElement(By.xpath(Loc.getProperty("adding"))).click();
		Thread.sleep(5000);
	
		
	}
}
