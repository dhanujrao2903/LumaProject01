package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class NewCustomersaccount extends BaseTest {
	@Test
	public static void accountCreation() throws InterruptedException {
		
		driver.findElement(By.xpath(Loc.getProperty("create_account"))).click();
		
		driver.findElement(By.xpath(Loc.getProperty("first_name"))).sendKeys("Dhananjay");
		
		driver.findElement(By.xpath(Loc.getProperty("last_name"))).sendKeys("kumar");
		
		driver.findElement(By.xpath(Loc.getProperty("email_name"))).sendKeys("ramu2800@gmail.com");
	
		driver.findElement(By.xpath(Loc.getProperty("email_psw"))).sendKeys("rajendra@1992");
		
		driver.findElement(By.xpath(Loc.getProperty("confirm_psw"))).sendKeys("rajendra@1992");
		
		driver.findElement(By.xpath(Loc.getProperty("create_acc"))).click();


	}
		
	}


