package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lokesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	ChromeOptions ch = new ChromeOptions();
	
	ch.addArguments("Incognito");
	
	WebDriver driver = new ChromeDriver(ch);
	
	driver.get("http://leafground.com/pages/Alert.html");
		
	WebElement simple = driver.findElement(By.xpath("//button[text()='Alert Box']"));
	simple.click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
	WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
	confirm.click();
	Thread.sleep(3000);
	org.openqa.selenium.Alert a = driver.switchTo().alert();
	a.accept();
	
	WebElement confirm1 = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
	confirm1.click();
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();

	WebElement prompt = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
	prompt.click();
	Thread.sleep(3000);
	driver.switchTo().alert().sendKeys("All the Best");
	String b = a.getText();
	driver.switchTo().alert().accept();
	
	System.out.println(b);

	
	}
}
