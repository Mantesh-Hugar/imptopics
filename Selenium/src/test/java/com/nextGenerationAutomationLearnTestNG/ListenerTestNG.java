package com.nextGenerationAutomationLearnTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestNG implements ITestListener {

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of the testcase passed is :" + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("The name of the testcase failed is :" + result.getName());
	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("The name of the testcase Skipped is :" + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}
