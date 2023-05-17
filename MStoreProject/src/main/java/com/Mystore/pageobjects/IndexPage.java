package com.Mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Mystore.actiondriver.Action;
import com.Mystore.base.BaseClass;

public class IndexPage extends BaseClass {

	@FindBy(xpath = "//a[@class='login']")
	WebElement SignInButton;

	@FindBy(xpath = "//img[@class='logo img-responsive']")
	WebElement MystoreLogo;

	@FindBy(id = "search_query_top")
	WebElement Searchproduct;

	@FindBy(name = "submit_search")
	WebElement SearchButton;

	public IndexPage() {
		PageFactory.initElements(driver, this);
	}

	public LoginPage ClickonSignin() {
		Action.click(driver, SignInButton);
		return new LoginPage();
	}

	public boolean validateLogo() {
		return Action.isDisplayed(driver, MystoreLogo);

	}

	public String GetTitle() {
		String mystoreTitle = driver.getTitle();
		return mystoreTitle;
	}

	public SearchResultPage searchProduct(String productName) {
		Action.type(Searchproduct, productName);
		Action.click(driver, Searchproduct);
		return new SearchResultPage();
	}
}
