package com.Script1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	WebDriver driver;

	@BeforeClass

	public void setup() throws Throwable {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

	}

	@Test()
	public void testcase1() throws InterruptedException {
		System.out.println("This is test case1");
	}
	
	@Test()
	public void testcase2() throws InterruptedException {
		System.out.println("This is test case2");
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
