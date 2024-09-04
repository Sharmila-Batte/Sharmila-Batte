package com.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StepsToReadPropertyFile3 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 1. First find the location where you have stored property file
		   2. Create an instance of FileInputStream class and pass the property file location to its constructor.
		   3. Create an instance of Properties class
		   4. With the help of properties reference variable call load() properties class and pass FileInputStream class reference to this method
   		   5. Call get(key) of Properties class to read data from property file
		 */
		/*Property file location with 
		 * absolute path: F:\JavaWorkspace\CoreJavaSessions\PropertyFiles\TestData.properties
		 * relative path: .\PropertyFiles\TestData.properties
		 * Using System class:
		 * 			String currentDir=System.getProperty("user.dir");
		 * 			String propertyFileLocation =currentDir+"\\PropertyFiles\\TestData.properties";
		 */
		
		//String fileLocation="F:\\JavaWorkspace\\CoreJavaSessions\\PropertyFiles\\TestData.properties";
					//or
		//String fileLocation="F:/GitAutomation/18thMay-2022/CoreJavaSessions/PropertyFiles/TestData.properties";	
		
		FileInputStream fis = new FileInputStream("E://Sharmila//Software Testing Training//Automation Testing//AutomationSession//Workspace//CoreJavaSessions//src//com//collections//ProperyFiles//TestData.properties");
	
		Properties prop=new Properties();	
		
		prop.load(fis);
		System.out.println(prop.getProperty("roi"));
		System.out.println(prop.getProperty("principleamount"));
		System.out.println(prop.getProperty("passord"));
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("URL"));
		
	}

}