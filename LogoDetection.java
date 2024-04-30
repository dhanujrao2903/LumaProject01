package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;


public class LogoDetection extends BaseTest {
	@Test
	 public static void logoTest() throws InterruptedException {
        boolean logoEnabled = driver.findElement(By.xpath(Loc.getProperty("logo_field"))).isEnabled();
        if (logoEnabled) {
            System.out.println("Logo is enabled.");
        } else {
            System.out.println("Logo is not enabled.");
        }
    }
}