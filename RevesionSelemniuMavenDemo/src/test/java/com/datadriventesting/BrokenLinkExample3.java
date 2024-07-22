package com.datadriventesting;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utility.SeleniumUtility;

public class BrokenLinkExample3 {

	public static void main(String[] args) {
		SeleniumUtility util = new SeleniumUtility();
		WebDriver driver = util.setUp("chrome", "https://demoqa.com/broken");
		// Storing the links in a list and traversing through the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Count of the links" + links.size());
		for (int i = 0; i < links.size(); i++) {
			verifyLinks(links.get(i).getAttribute("href"));
		}
	}

	public static void verifyLinks(String linkUrl) {
		try {
			URL url=new URL(linkUrl);
			HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			if(httpURLConnect.getResponseCode()>=400)
			{
				System.out.println(linkUrl+"--response code is--> "+httpURLConnect.getResponseMessage()+"-- is a invalid/broken link");
			}
			else
			{
				 System.out.println(linkUrl+"--response code is-->"+httpURLConnect.getResponseMessage()+ "-- Valid link");
			}
			
			
		} catch (Exception e) {
			System.out.println("**********Link is not having href***********");
		}

	}

}
