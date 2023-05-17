package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSLocator {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		// Tag and ID
//		WebElement uname = driver.findElement(By.cssSelector("#email"));
//		uname.sendKeys("mantesh");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("Mantesh");
		
		
		//Tag and Class
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("Admin");
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("admin");
		
		
		//Tag and attribute
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("eyeryrjsdb");
		//driver.findElement(By.cssSelector("[name=email]")).sendKeys("tyrurtu");
		
		
		//Tag, class and attribute
		
		driver.findElement(By.cssSelector("input.inputtext[id=pass]")).sendKeys("uerwycnvbv");
		
		
		

	}

}
