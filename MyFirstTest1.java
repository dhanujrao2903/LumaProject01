package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

  public class MyFirstTest1  extends BaseTest{
	 @Test
	public static void loginTest() throws InterruptedException {
		 
	 driver.findElement(By.xpath(Loc.getProperty("sign_in"))).click();
		 Thread. sleep(5000);
		 driver.findElement(By.xpath(Loc.getProperty("email_field"))).sendKeys(" ramu2800@gmail.com");
		 driver.findElement(By.xpath(Loc.getProperty("reg_psw"))).sendKeys( "rajendra@1992");
		 Thread. sleep(5000);
		 driver.findElement(By.xpath(Loc.getProperty("sign_in1"))).click();


	}

}
