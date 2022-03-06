package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lokesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeOptions ch = new ChromeOptions();
		
		ch.addArguments("Incognito");
		
		WebDriver driver = new ChromeDriver(ch);
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("");
		
		
		
	}
}
