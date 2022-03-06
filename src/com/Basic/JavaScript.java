package com.Basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.server.handler.GetCurrentWindowHandle;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScript {
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lokesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
				
		WebDriver driver = new ChromeDriver(ch);
		
		driver.get("https://www.amazon.in/");
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		WebElement japan = driver.findElement(By.xpath("//a[text()='Japan']"));
		
//		js.executeScript("arguments[0].scrollIntoView()", japan);
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0, -1000)");
//		
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0, 200)");
//		
//		js.executeScript("arguments[0].click()", japan);
		
		Actions a = new Actions(driver);
		
//		a.doubleClick(japan).perform();
//		a.contextClick(japan).perform();
		
		WebElement tab = driver.findElement(By.xpath("//a[text()= 'Mobiles']"));
		a.contextClick(tab).build().perform();
		
		Robot r = new Robot();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()= 'Mobiles']")));
		
		
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		Set<String> set = driver.getWindowHandles();
		for (String id : set) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
		

			}
			
		}

}

