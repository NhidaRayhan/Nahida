package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {//To remove the null pointer exception (as Java cannot read null value)
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//*[text()=' Login ']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//*[@class='oxd-userdropdown-name']")
	private WebElement dropdown;
	
	@FindBy(xpath="(//*[@class='oxd-userdropdown-link'])[4]")
	private WebElement logoutbtn;
	
	@FindBy(xpath="//*[contains(text(),'PIM')]")
	private WebElement pim;
	
	@FindBy(xpath="//*[@class='oxd-icon bi-stopwatch']")
	private WebElement stopwatch;

	public WebElement getStopwatch() {
		return stopwatch;
	}

	public WebElement getPim() {
		return pim;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getUsername() {
		return username;
	}

}
