package com.capitalone.api.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox_Handling_Chrome {

	public static void main(String[] args) {

		// Set system property for Chrome driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kiran\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// Initialize browser
		WebDriver sampleDriver = new ChromeDriver();
		sampleDriver.get("http://www.spicejet.com/");

		// handling check boxes
		System.out.println(sampleDriver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected()); // returns true or false
	  sampleDriver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).click(); // check box is being clicked
																								

		System.out.println(sampleDriver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		sampleDriver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).click(); // check box is being clicked

		System.out.println(sampleDriver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

	}

}
