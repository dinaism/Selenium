package com.Basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class From1stDay {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lokesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	ChromeOptions ch = new ChromeOptions();
	ch.addArguments("Incognito");
			
	WebDriver driver = new ChromeDriver(ch);
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
//	Point p = new Point(100, 200);
//	driver.manage().window().setPosition(new Point (100, 20));
//	Dimension d = new Dimension (500, 200);
//	driver.manage().window().setSize(new Dimension(500, 700));
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("dina.ism@gmail.com");

	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("Apache@88");
	
	boolean b = email.isDisplayed();
	System.out.println("Displayed: "+ b);
	
	boolean c = email.isEnabled();
	System.out.println("Enabled: "+ c);
	
	boolean g = email.isSelected();
	System.out.println("Selected:" + g);
	
	WebElement click = driver.findElement(By.xpath("//button[@type='submit']"));
	click.click();
		
	Thread.sleep(3000);
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File f = new File("C:\\Users\\Lokesh\\eclipse-workspace\\Selenium\\Screenshot\\image.png");
	FileHandler.copy(source, f);
	
	}	

}
