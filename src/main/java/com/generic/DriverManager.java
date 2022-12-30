package com.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	public void getDriver() {
		
		//To get the Selenium driver
		//System.setProperty("package name", "driver path");
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver_v108.exe");
		WebDriverManager.chromedriver().setup();
		
		//To open the browser
		WebDriver driver = new ChromeDriver(); //Upcasting
		
		driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='Home_Ancillary_5']"))));
		
		
		WebElement drag = driver.findElement(By.xpath(""));
		WebElement drop = driver.findElement(By.xpath(""));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//*[@id='Home_Ancillary_5']"))).perform();
		
		ac.dragAndDrop(drag, drop);
		
	}
	
	public static void main(String[] args) {
		DriverManager obj = new DriverManager();
		obj.getDriver();
	}
	

}
