package com.assignments;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utility.SeleniumUtility1;

public class ERail {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility1 util = new SeleniumUtility1();
		WebDriver driver = util.setUp("Chrome", "https://erail.in/");
		//click on eCatering
        util.clickOnElement(driver.findElement(By.xpath("//a[text()='eCatering']")));
        Set<String> windows=driver.getWindowHandles();
        Iterator<String>itr=windows.iterator();
        String parnetID=itr.next();
        String childID=itr.next();
        driver.switchTo().window(childID);
        //enter train number 12627 and select from suggestion
        WebElement search=driver.findElement(By.cssSelector(".mb-6.flex-shrink-0 .form-input"));
        search=driver.findElement(By.cssSelector(".mb-6.flex-shrink-0 .form-input"));
        util.clickOnElement(search);
        driver.findElement(By.xpath("//input[@placeholder='What you are yearning for?']")).sendKeys("12627");
        Thread.sleep(5000);
        List<WebElement>stations=driver.findElements(By.cssSelector(".no-scrollbar .w-full.mb-48>div"));
        System.out.println("All stations: "+stations.size());
        for(WebElement station:stations)
        {
        	System.out.println(station.getText());
        	if(station.getText().contains("KARNATAKA EXP"))
        	{
        		util.waitForElementDisplayed(station);
        		station.click();
        		break;
        	}
        }
        //date from next month
        util.clickOnElement(driver.findElement(By.cssSelector(".custom-date-picker")));
     
        driver.switchTo().activeElement().sendKeys((Keys.ARROW_DOWN),(Keys.ENTER));
        //any station (Itarsi)
        WebElement boardDropDown=driver.findElement(By.xpath("//select[@placeholder='Boarding Station']"));
        Select boardSelect=new Select(boardDropDown);
        boardSelect.selectByValue("ET");
        System.out.println(boardSelect.getFirstSelectedOption().getText());
        //click on find food
        util.clickOnElement(driver.findElement(By.xpath("//button[text()='FIND FOOD']")));
        //print all resturent names
        //List<WebElement> restroList=driver.findElements(By.cssSelector("div[class*='screen-content-width flex']>*:last-child>div>div:not([class*='hidden']) h5]"));
        //go back home page
        driver.switchTo().window(parnetID);
        //1. from: Pune
        WebElement from=driver.findElement(By.id("txtStationFrom"));
        from.clear();
        from.sendKeys("Pune");
        Thread.sleep(1000);
        List<WebElement> puneList=driver.findElements(By.xpath("//div[@style='width:240px;float:left;overflow:hidden']"));
        System.out.println(puneList.size());
        for(WebElement fromCity:puneList)
        {
        	if(fromCity.getText().contains("Pune Jn"))
        	{
        		fromCity.click();
        		break;
        	}
        }
        WebElement To=driver.findElement(By.id("txtStationTo"));
        To.clear();
        To.sendKeys("Bangalore");
       // Thread.sleep(1000);
       // List<WebElement> bangaloreList=driver.findElements(By.cssSelector("#AutocompleteContainter_1721355598812 .autocomplete-w1 div div[title*='Bangalore']"));
        //Thread.sleep(1000);
        //System.out.println(bangaloreList.size());
        //for(WebElement toCity:bangaloreList)
        //{
        	//System.out.println(toCity.getText());
        	//if(toCity.getText().contains("Bangalore Cant"))
        	//{
        	//	toCity.click();
        	//	break;
        	//}
       // }
        //sort on date
        driver.findElement(By.xpath("//input[@title='Select Departure date for availability']")).click();
        driver.findElement(By.xpath("(//table[@class='Month'])[2] //td[text()='23']")).click();
        
        
        
        
		
		

	}

}

/*
TC5:
https://erail.in/
click on eCatering
enter train number 12627 and select from suggestion
date from next month
any station (Itarsi)
click submit
print all resturent names
go back home page
perform following
	1. from: Pune
	2. to: Bangalore
	3. date from next month
	4. click on get trains
print all the train numbers and name which are running on that particular date
*/