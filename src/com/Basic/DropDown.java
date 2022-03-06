package com.Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lokesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeOptions ch = new ChromeOptions();
		
		ch.addArguments("Incognito");
		
		WebDriver driver = new ChromeDriver(ch);
		
		driver.get("http://leafground.com/");
		
		WebElement icon = driver.findElement(By.xpath("//img[@alt='Checkbox']"));
		
		icon.click();
		
		WebElement check = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		check.click();
		
		driver.navigate().back();
		
		WebElement drop = driver.findElement(By.xpath("//h5[text() = 'Drop down']"));
		
		drop.click();
		
		WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s = new Select(multi);
		
		s.selectByValue("2");
		s.selectByVisibleText("Selenium");
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for (WebElement all : allSelectedOptions) {
			
			System.out.println(all.getText());	
		}
				
		List<WebElement> options = s.getOptions();

		for (WebElement c : options) {
			
			System.out.println(c.getText());
		}
		
		boolean b = s.isMultiple();
		System.out.println(b);
	
		
	}


}
