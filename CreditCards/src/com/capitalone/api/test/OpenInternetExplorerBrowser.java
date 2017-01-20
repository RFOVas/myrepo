package com.capitalone.api.test;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;

	public class OpenInternetExplorerBrowser {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\kiran\\Downloads\\IEDriverServer_x64_3.0.0\\IEDriverServer.exe");
			WebDriver sampleDriver = new InternetExplorerDriver();
		
			sampleDriver.get("https://www.lowes.com");
			
		}

	}

