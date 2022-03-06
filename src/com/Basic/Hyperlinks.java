package com.Basic;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hyperlinks {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lokesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
				
		WebDriver driver = new ChromeDriver(ch);
		
		driver.get("https://www.amazon.in/");


		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Hyperlink no: " + links.size());
		
		List<WebElement> list = driver.findElements(By.tagName("input"));
		System.out.println(list.size());
		
	}
	}
