package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class PantShopWishList extends BaseTest{
	@Test
	public void wish() throws InterruptedException {
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
		driver.findElement(By.xpath(Loc.getProperty("wish_list"))).click();
		Thread.sleep(5000);
		 driver.findElement(By.xpath(Loc.getProperty("email_field"))).sendKeys(" ramu2800@gmail.com");
		 driver.findElement(By.xpath(Loc.getProperty("reg_psw"))).sendKeys( "rajendra@1992");
		 Thread. sleep(5000);
		 driver.findElement(By.xpath(Loc.getProperty("sign_in1"))).click();


}}
