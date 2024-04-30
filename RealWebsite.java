package testcase;

import org.testng.annotations.Test;

import base.BaseTest;

public class RealWebsite extends BaseTest {
	
	@Test
	 public static void actualwebsitetest() {
		 String s =driver.getCurrentUrl();
		 if (s.equals("https://magento.softwaretestingboard.com/")) {
			 System.out.println("u r in magento website");
			 } else {
			 System.out.println("u r not in magento website");
			 }
	 }

	
	}


