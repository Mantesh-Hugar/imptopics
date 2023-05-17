package com.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
WebDriver driver;

@Test
	public void fm() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Newman/framePage1.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("pwd")).sendKeys("manager");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("un")).sendKeys("MH");
	}
}
