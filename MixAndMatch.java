package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class MixAndMatch extends BaseTest{
	@Test
	public void shopTees() throws InterruptedException  {
		driver.findElement(By.xpath(Loc.getProperty("match_mix"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("price_matchmix"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("$forty_above"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("pattern"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("solid"))).click();
	}
	    

}
