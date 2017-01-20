package com.capitalone.api.test;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Locator_LinkText_FireFox {

		public static void main(String[] args) {

			System.setProperty("webdriver.gecko.driver", "C:/Users/kiran/Downloads/geckodriver.exe");
			WebDriver sampleDriver = new FirefoxDriver();
			sampleDriver.get("http://www.facebook.com");
			
			sampleDriver.findElement(By.linkText("Forgot account?")).click();
			sampleDriver.findElement(By.partialLinkText("Forgot")).click();//Locating the Forgot account link by partial text 'Forgot' only
		
	    
			 
		}

	}
