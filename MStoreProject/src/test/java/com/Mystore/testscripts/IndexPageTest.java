package com.Mystore.testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Mystore.base.BaseClass;
import com.Mystore.pageobjects.IndexPage;

public class IndexPageTest extends BaseClass {

	IndexPage indexPage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
	
	@Test
	public void verifyLogo() {
		indexPage =new IndexPage();
		boolean result = indexPage.validateLogo();
		Assert.assertTrue(result);
	}
	@Test
	public void verifyTitle() {
		String actTitle = indexPage.GetTitle();
		Assert.assertEquals(actTitle, "My Store");
		System.out.println(actTitle);
		
	}
}
