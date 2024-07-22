package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utility.SeleniumUtility;

public class HandlingFrame {

	public static void main(String[] args) {
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome", "https://jqueryui.com/");
		//click on selectable
		WebElement selectable=driver.findElement(By.xpath("//a[text()='Selectable']"));
		util.clickOnElement(selectable);
		//move control inside the frame to perform required opr on the element
		WebElement  frame=driver.findElement(By.cssSelector(".demo-frame"));
		//driver.switchTo().frame(0);
		//or
		driver.switchTo().frame(frame);
		util.clickOnElement(driver.findElement(By.cssSelector("#selectable>li:nth-of-type(2)")));
		//to get the control back to main page use
		driver.switchTo().defaultContent();
		util.clickOnElement(driver.findElement(By.cssSelector(".logo>a")));

		
		
	
		
		
		
	}

}


/*
open https://jqueryui.com/
click on Selectable
select any item
click on site logo
*/