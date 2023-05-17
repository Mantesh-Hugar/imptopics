package com.TestNGGroups;

import org.testng.annotations.Test;

public class TestCase2 {

	@Test(groups = {"Functional Testing"})
	public void composeMail() {
		System.out.println("Mail Sent");
	}
}
