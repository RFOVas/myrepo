package com.capitalone.api.test;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Radiobuttons_Handling_Chrome {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\kiran\\Downloads\\chromedriver_win32\\chromedriver.exe");

			// Initialize browser
			WebDriver sampleDriver = new ChromeDriver();
	   	sampleDriver.get("http://www.echoecho.com/htmlforms10.htm");

		
			// handling Radio buttons					
			sampleDriver.findElement(By.xpath("//input[@value='Cheese']")).click(); //selecting radio button by value
			
			int sizeOfGroup = sampleDriver.findElements(By.xpath("//input[@name='group1']")).size(); //this returns the number of radio buttons in that particular group
			System.out.println("sizeOfGroup=" + sizeOfGroup);                                                                      
			
			for(int i=0;i<sizeOfGroup;i++){//for each radio button in that group perform the below steps
				sampleDriver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				String attrValue = sampleDriver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
				System.out.println("attrValue= " + attrValue);
				
				if(attrValue.equalsIgnoreCase("cheese")){
					System.out.println("hey i found cheese");
				}
				
			}
					
		}

	}
