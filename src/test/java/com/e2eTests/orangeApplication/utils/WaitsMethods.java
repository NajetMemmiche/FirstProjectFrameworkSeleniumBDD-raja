package com.e2eTests.orangeApplication.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsMethods {
	
	WebDriverWait waitExplicit;
	
		
	public void implicitWait(WebDriver driver_i, long second_i) {	
		driver_i.manage().timeouts().implicitlyWait(second_i, TimeUnit.MILLISECONDS);
	}
	
	public WebElement explicitWaitUntilVisibilityOfButton(WebDriver driver_e, By locator, long second_e) {
		WebElement button;
		waitExplicit = new WebDriverWait(driver_e, second_e);
		button = waitExplicit.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return button;
	}
	

}
