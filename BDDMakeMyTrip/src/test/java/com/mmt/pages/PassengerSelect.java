package com.mmt.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PassengerSelect {
	
	WebDriver driver;
	public PassengerSelect(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[@class='block radio']//input[@value='no']")
	List <WebElement> fdg;
	
	@FindBy(xpath="//*[@class=\"fli_primary_btn btn text-uppercase continue_cta \"]")
	WebElement asd;
	
	@FindBy(xpath="//*[@id=\"wrapper_ADULT\"]/a")
	WebElement add;
	
	@FindBy(xpath="//*[@class='tvlrFormField make_relative FIRST_NAME']//*[@type='text']")
	WebElement firstName;
	
	@FindBy(xpath="//*[@class='tvlrFormField make_relative LAST_NAME']//*[@type='text']")
	WebElement lastName;
	
	@FindBy(xpath="//*[@class='tvlrFormField make_relative MOBILE_NUMBER']//input[@type='text']")
	WebElement phoneNumber;
	
	@FindBy(xpath="//*[@class='tvlrFormField make_relative EMAIL']//input[@type='text']")
	WebElement email;
	
	@FindBy(xpath="//*[@class=\"chooseGender-info GENDER \"]")
	List <WebElement> gender;
	
	@FindBy(xpath="//*[@class='make_relative blocked_traveller_booking']//*[@type='button']")
	WebElement clickConntinue;
	
	public void switchWindow()
	{
		  ArrayList<String> availableWindows = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(availableWindows.get(1)); 
	}
	
	public void selectPassenger()
	{
		if(fdg.size()!=0)
		{
			System.out.println("inside of if select passenger");
		fdg.get(0).click();
	    asd.click();
		} 
		else
		{
		asd.click();  
		} 
		System.out.println("Select passenger ................!");
		
			     Actions act = new Actions(driver);
			     Action s2 = act
		 				 .moveToElement(add)
		 				 .click()
		 				 .build();
		 		 s2.perform(); 
		 		 System.out.println("Selet  pass end");
	}
	
	public void enterPassDetils(String fname,String lname,String gendeR,String phNum,String Email)
	{
		System.out.println("....................................");
	String edj=	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/form/div[3]/div[1]/p/span")).getText();
		System.out.println("************"+edj);
		firstName.click();
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		
		if(gendeR.equalsIgnoreCase("male"))
		{
			gender.get(0).click();
		}
		else
		{
			gender.get(1).click();
		}
		phoneNumber.sendKeys(phNum);
		email.sendKeys(Email);
		clickConntinue.click();
		WebElement sda=  driver.findElement(By.xpath("//*[@id=\"ancillary-secondary\"]"));
		  Actions act = new Actions(driver);
		     Action s3 = act
					 .moveToElement(sda)
					 .click()
					 .build();
			 s3.perform(); 
	}
	

}
