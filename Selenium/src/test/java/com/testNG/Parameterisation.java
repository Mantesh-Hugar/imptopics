package com.testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation {
	

	@Test
	@Parameters("browser")
	public void parameters(String browser) {
	if(browser.equals("firefox")){ 
		 System.out.println("Open Firefox Driver"); 
		 } 
		else if(browser.equals("chrome")){ 
		 System.out.println("Open Chrome Driver"); 
		} 
		 }
}
