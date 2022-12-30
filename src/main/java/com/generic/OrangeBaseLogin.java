package com.generic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.BaseConfig;
import com.utilities.Highlighter;
import com.utilities.Screenshot;

public class OrangeBaseLogin {
	
	
	
	public void getLogin() {
		
		//System.setProperty("package name", "driver path");
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver_v107.exe");
		
		//open the browser
		WebDriver driver = new ChromeDriver();//up casting
		
		//go to the URL
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(BaseConfig.getConfigValue("URL"));
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//Create an object of MasterPageFactory class 
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit Wait
		//Wait till the Login button is loaded (clickable/enabled/visible)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getLoginbtn()));
		
		
		//To highlight username field
		Highlighter.addColor(driver, mpf.getUsername());
		
		//Enter the username in the username field
		mpf.getUsername().sendKeys(BaseConfig.getConfigValue("Username"));
	
		//To highlight password field
		Highlighter.addColor(driver, mpf.getPassword());		
		
		//Enter the password in the password field
		mpf.getPassword().sendKeys(BaseConfig.getConfigValue("Password"));
		
		//To highlight login button
		Highlighter.addColor(driver, mpf.getLoginbtn());		
		
		//Click on Login
		mpf.getLoginbtn().click();
		
		//Wait till the dropdown button is loaded (clickable/enabled/visible)
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getDropdown()));
		
		//Wait till the logout button is loaded (clickable/enabled/visible)
		//wait.until(ExpectedConditions.elementToBeClickable(mpf.getLogoutbtn()));
		
		//Screenshot of the website after login
		Screenshot.getScreenShot(driver, "After_Login");
		

		//To highlight dropdown button
		Highlighter.addColor(driver, mpf.getDropdown());
		
		//Click on the dropdown
		mpf.getDropdown().click();
		
		//To highlight logout button
		Highlighter.addColor(driver, mpf.getLogoutbtn());		
		
		//Click on the logout
		mpf.getLogoutbtn().click();
		
		//Take a screenshot after logging out
		Screenshot.getScreenShot(driver, "After_Logout");
		
		//Close the browser
		//driver.close(); //Close out the current window only
		driver.quit(); //Close out the whole browser
		
	}

}
