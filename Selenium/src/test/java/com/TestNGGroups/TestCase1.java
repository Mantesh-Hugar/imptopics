package com.TestNGGroups;

import org.testng.annotations.Test;

public class TestCase1 {
	
@Test(groups = {"smokeTest"})	
public void loginTest() {
	System.out.println("Logged in Successfully");
}
}
