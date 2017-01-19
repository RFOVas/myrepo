package com.capitalone.api.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:/Users/kiran/Downloads/geckodriver.exe");
		WebDriver sampleDriver = new FirefoxDriver();
		
		
		sampleDriver.get("http://www.facebook.com");
		System.out.println(sampleDriver.getTitle());
		// System.out.println(sampleDriver.getPageSource());
		System.out.println(sampleDriver.getCurrentUrl());
		sampleDriver.close();

		// WebDriver driver = new ChromeDriver();
	}

}
