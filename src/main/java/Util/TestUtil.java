package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BaseClass;

public class TestUtil extends BaseClass{
	
	public static void click_on_Element(WebElement element) {	
		element.click();		
	}
	public static void enterText (WebElement element, String text) {	
		
		element.sendKeys(text);	
	}
	public static void scrollByVisibleElement(WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		/*Pass in true to scrollIntoView if the object you're scrolling to is beneath where you currently are, 
		false if the object you're scrolling to is above where you currently are*/
		js.executeScript("arguments[0].scrollIntoView(false);", element);		
	}
	public static void handle_StaleEle_Exception(WebElement ele)
	{
		boolean result = false;
	    int attempts = 0;
	    while(attempts < 2) {
	        try {
	            ele.click();
	            result = true;
	            break;
	        } catch(StaleElementReferenceException  e) {
	        }
	        attempts++;
	    }		
	}

}
