package com.datadriventesting;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utility.SeleniumUtility1;

public class ActitimeLogin {

	public static void main(String[] args) {
		SeleniumUtility1 util=new SeleniumUtility1();
		WebDriver driver=util.setUp("chrome", "https://online.actitime.com/tcs/login.do");
		/*
		 * validate mouse pointer is present in username input field
				or
			validate focus is on username input field
		 */
		WebElement element=driver.switchTo().activeElement();
		String actiElement=util.getRequiredAttributeValue(element,"placeholder");
		System.out.println("is focus on Username input field? "+actiElement.equals("Username"));
		
		//login into application without identifying any element
		element.sendKeys("admin01",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("admin01",Keys.ENTER);

		
		
		
		
		
	}

}
/*
validate mouse pointer is present in username input field
	or
validate focus is on username input field

login into application without identifying any element

*/