package com.capitalone.api.test;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

	public class VAs {

		public static void main(String[] args) {

			System.setProperty("webdriver.gecko.driver", "C:/Users/kiran/Downloads/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();


	//asserts
	driver.get("https://www.makemytrip.com/flights");
//	driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();
//	
	Assert.assertTrue(false);
	driver.get("https://www.rightstay.com/?utm_source=mmt&utm_medium=tab&utm_campaign=RightstayDeal&intid=homepage_tab_Rightstay");
	}

	}