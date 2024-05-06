package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Signout extends BaseTest {
	
	@Test
	public void signingout() {
		  
		driver.findElement(By.xpath(Loc.getProperty("panel_btn"))).click();
		driver.findElement(By.xpath(Loc.getProperty("sign_out"))).click();

	}

}
