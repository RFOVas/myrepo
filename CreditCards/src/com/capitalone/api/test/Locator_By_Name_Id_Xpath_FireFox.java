package com.capitalone.api.test;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Locator_By_Name_Id_Xpath_FireFox {

		public static void main(String[] args) { 

			System.setProperty("webdriver.gecko.driver", "C:/Users/kiran/Downloads/geckodriver.exe");
			WebDriver sampleDriver = new FirefoxDriver();
			sampleDriver.get("http://www.facebook.com");    
			
			
			sampleDriver.findElement(By.id("email")).sendKeys("qaclickacademy@gmail.com");//Locating the Email field by ID and sending value into it
			sampleDriver.findElement(By.name("pass")).sendKeys("12345678");//Locating the Password field by Name and sending value into it
			sampleDriver.findElement(By.xpath(".//*[@id='u_0_o']")).click();//Locating the Login field by Xpath and clicking it
		
				
		sampleDriver.findElement(By.xpath(".//*[@id='u_0_f']")).click();// Locating the 'Create Account' button by Xpath on Facebook.com page and clicking on it
			
			
		//	Locating the 'Sign Up' button on Twitter.com page by Xpath and clicking on it
			WebDriver driver2 = new FirefoxDriver();
			driver2.get("https://twitter.com/");    
			driver2.findElement(By.xpath(".//*[@id='doc']/div[1]/div/div[1]/div[2]/a[2]")).click();
			 
		}

	}
