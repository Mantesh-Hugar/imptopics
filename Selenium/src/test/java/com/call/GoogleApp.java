package com.call;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Base.LaunchApp;

public class GoogleApp extends LaunchApp {

	@Test
	public void type() {

		driver = lapp();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Mantesh");
	}
}
