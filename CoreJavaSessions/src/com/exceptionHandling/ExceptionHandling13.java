package com.exceptionHandling;

public class ExceptionHandling13 {
    public static void main(String[] args) throws InterruptedException, ShaileshExceltion
    {
    	System.out.println("program starts");
    	setSleep(2000);
    	checkNumber(10);
        System.out.println("Hello Geeks");
    }
    static void setSleep(long time) throws InterruptedException {
    	Thread.sleep(time);
    }
    
    static void checkNumber(int num) throws ShaileshExceltion {
    	if(num<0){
    		throw new ShaileshExceltion("Number less dn zero");
    	}else {
    		System.out.println("Number is :"+num);
    	}
    }
}