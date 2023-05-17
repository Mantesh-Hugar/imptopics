package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFrameWorkBYTestNG //we need to create dataproviderclass here
{
@Test(dataProvider ="Db")
public void loginTest(String Uid, String pwd) {
	System.out.println("Username is "+Uid);
	System.out.println("Password is "+pwd);
}

@DataProvider(name="Db")
public Object[][] getData() {
	Object[][] obj = new Object[2][2];
	obj [0][0]="Mantesh";
	obj [0][1]="mantesh@123";
	
	obj[1][0]="Deepak";
	obj[1][1]="Dp@123";
	
	return obj;
}
}
