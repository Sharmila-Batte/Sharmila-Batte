package com.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.SeleniumUtility;

public class ConfirmationAlertHandling {

	public static void main(String[] args) {

		SeleniumUtility util = new SeleniumUtility();
		WebDriver driver = util.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame("iframeResult");
		//click on try it
	    util.clickOnElement(driver.findElement(By.xpath("//button[text()='Try it']")));
	    System.out.println(driver.switchTo().alert().getText());
	    //to click on OK/Yes/Confirm button
	    //driver.switchTo().alert().accept();
	    //to click on Cancel/No/Close button
	   driver.switchTo().alert().dismiss();
	    System.out.println(driver.findElement(By.id("demo")).getText());
	}

}
