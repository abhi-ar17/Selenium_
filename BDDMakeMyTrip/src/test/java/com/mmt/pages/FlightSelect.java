package com.mmt.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FlightSelect {
	
	WebDriver driver;
	public FlightSelect(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[@class=\"pull-left make_relative\"]//button")
	List <WebElement> ayu;
	
	public void selectFlght()
	{
			 WebElement fgh = ayu.get(0);
			  Actions act = new Actions(driver);
			  Action seria = act
						 .moveToElement(fgh)
						 .click()
						 .build();
				 seria.perform();
	}

}
