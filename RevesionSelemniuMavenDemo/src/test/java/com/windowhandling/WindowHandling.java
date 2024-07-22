package com.windowhandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.SeleniumUtility;

public class WindowHandling {

	public static void main(String[] args) {
		SeleniumUtility util = new SeleniumUtility();
		WebDriver driver = util.setUp("chrome", "https://etrain.info/in");
		// current window unique id
		String parentId = driver.getWindowHandle();
		System.out.println("Parent Id:" + parentId);
		// title of parent window
		System.out.println("title of parent window: " + driver.getTitle());
		// click on twitter
		util.clickOnElement(driver.findElement(By.cssSelector(".icon-twitter")));
		Set<String> windows = driver.getWindowHandles();
		System.out.println("All window Ids: " + windows);
		System.out.println("count of all windows: " + windows.size());

		// get child window id from windows
		windows.remove(parentId);
		Iterator<String> itr = windows.iterator();
		String childId = itr.next();
		System.out.println("Child id: " + childId);

		// now we can move to child tab/window
		driver.switchTo().window(childId);

		// you have a control on child window, you can perform any required operation on
		// it
		System.out.println("child window title: " + util.getPageTitle("Log in to X / X"));

		// it will close child window, but control won't be shifted to parent window
		// automatically
		// driver.close();
		// for parent window again move your control
		driver.switchTo().window(parentId);
		System.out.println("Home page title: " + driver.getTitle());

		// it will close parent window
		// driver.close();

		// you want to close all windows in one time
		driver.quit();

	}

}
