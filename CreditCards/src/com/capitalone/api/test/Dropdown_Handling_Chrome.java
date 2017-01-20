package com.capitalone.api.test;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Dropdown_Handling_Chrome {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\kiran\\Downloads\\chromedriver_win32\\chromedriver.exe");

			// Initialize browser
			WebDriver sampleDriver = new ChromeDriver();
			sampleDriver.get("http://www.spicejet.com/");
			
		  sampleDriver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();// dynamic dropdown
	      sampleDriver.findElement(By.xpath("//a[@value='GOI']")).click();// For dynamic dropdown always use custom Xpath */

			
			// If you want to access any methods in class, create object for the
			// class and access methods using object.methodname
	        Select dropdown = new Select(sampleDriver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));// static
																														// dropdown
	        dropdown.selectByIndex(4); //select dropdown by index
			dropdown.selectByVisibleText("9 Adults"); //select dropdown by Visible Text
			dropdown.selectByValue("8"); //Select dropdown by Value

		
		}

	}
