package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Addressbook  extends BaseTest {
	@Test
	public void addnewAddress() throws InterruptedException {
		driver.findElement(By.xpath(Loc.getProperty("sign_in"))).click();
		 Thread. sleep(5000);
		 driver.findElement(By.xpath(Loc.getProperty("email_field"))).sendKeys(" ramu2801@gmail.com");
		 driver.findElement(By.xpath(Loc.getProperty("reg_psw"))).sendKeys( "rajendra@1991");
		 Thread. sleep(5000);
		 driver.findElement(By.xpath(Loc.getProperty("sign_in1"))).click();
			Thread.sleep(5000);

		driver.findElement(By.xpath(Loc.getProperty("panel_btn"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("my_account"))).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath(Loc.getProperty("address_book"))).click();
		Thread.sleep(7000);
		
		driver.findElement(By.id(Loc.getProperty("company_name"))).sendKeys("samsung electronics");
		Thread.sleep(7000);
		driver.findElement(By.xpath(Loc.getProperty("phone_no"))).sendKeys("9811274300");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("street"))).sendKeys("ladosarai");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("street_line2"))).sendKeys("saket");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(Loc.getProperty("street_line3"))).sendKeys("south Delhi");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("city_name"))).sendKeys("New Delhi");
		Thread.sleep(5000);

		driver.findElement(By.xpath(Loc.getProperty("country_name"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("pin_code"))).sendKeys("110017");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("province"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("save_add"))).click();
		Thread.sleep(5000);


	}
}


	
		


	


