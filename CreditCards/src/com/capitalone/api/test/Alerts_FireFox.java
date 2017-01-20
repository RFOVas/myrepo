package com.capitalone.api.test;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Alerts_FireFox {

		public static void main(String[] args) {

			System.setProperty("webdriver.gecko.driver", "C:/Users/kiran/Downloads/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();

	//driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

	  //driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();	
	//System.out.println(driver.switchTo().alert().getText()); // switching the control to Alert pop up
	//driver.switchTo().alert().sendKeys("abcxye"); //if there is edit box in the alert pop up to enter text
	//driver.switchTo().alert().accept(); //Accept = ok done yes

	//driver.switchTo().alert().dismiss();// If there is dismiss or cancel button on the alert pop up

	
	//hide
	driver.get("https://www.makemytrip.com/flights");
	driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();
	
	}

	}